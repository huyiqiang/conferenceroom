			// Mock数据
			// Mock.mock('/api/data',function(param){
			// 	var param = JSON.parse(param.body)
			// 	if(param.password==='123'){
			// 		return {code:1}
			// 	}else{
			// 		return {code:0,message:"用户名或密码错误"}		
			// 	}	
			// })
			var app = new Vue({
				el: '#app',
				data: {
					loginForm: { //表单v-model的值
						username: '',
						password: ''
					},
					rules: { //验证规则
						username: [{
								required: true,
								message: '请输入用户名',
								trigger: 'blur'
							},
							{
								min: 6,
								max: 16,
								message: '用户名在6到16位之间',
								trigger: 'blur'
							}
						],
						password: [{
							required: true,
							message: '请输入密码',
							trigger: 'blur'
						}]
					}

				},
				methods: {
					resetForm(formName) {
						this.$refs[formName].resetFields();
					},
					submitForm(formName) {
						this.$refs[formName].validate((valid) => {
							if (valid) { //验证通过
								axios
									.post('http://localhost:8080/login', this.loginForm)
									.then(res => {
										console.log(res)
										console.log("哈哈哈"+res.data.code)
										if (res.data.code === 1) {
											this.$message({
															type: 'success',
															message: '登录成功'
														})
														//跳转至frame页面
														window.location.href='../frame.html';
										} else{
											this.$message({
												message:res.data.message,
												type: "error"
											});
										}
									})
									.catch(function(error) { // 请求失败处理
										console.log(error);
									});
							} else { //验证不通过
								console.log('error submit');
								return false;
							}
						});
					}
				}
			})
