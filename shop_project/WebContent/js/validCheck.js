
function validateCheck(){
    	 var f = document.frm;//f== 폼 엘리먼트 객체 
    	 
    	//정규식 정의
    	var idExp = /^[a-zA-Z0-9]{5,20}$/;
    	var emailExp = /^[a-zA-Z0-9]+@[a-zA-Z]+\.[a-zA-Z]+$/;
    	var telExp =/^[0-9]{7,13}$/
    	var passExp =/^[0-9]{5,20}$/

    		
    	if(f.id.value==""){
        		alert('아이디를 입력해주세요.');
        		f.id.focus();
        		return;
    	}else if(!idExp.test(f.id.value)){
    		alert('아이디 5-20자리를 입력해주세요.');
    		f.id.focus();
    		return;
    	}else if(f.pass.value==""){
    		alert('비밀번호를 입력해주세요.');
    		f.pass.focus();
    		return;
    	}else if(!passExp.test(f.pass.value)){
    		alert('비밀번호는 숫자 5자리 숫자로 기입해주세요.');
    		console.log(f.contents.value);
    		f.pass.focus();
    		return;
    	}else if(f.pass.value != f.passCK.value){
    		alert('비밀번호가 같지 않습니다.')
    		f.passCK.focus();
    	}else if(f.email.value==""){
    		alert('이메일을 입력해주세요.');
    		f.writer.focus();
    		return;
    	}else if(!emailExp.test(f.email.value)){
    		 alert('유효하지 않는 이메일 형식입니다')
    		 f.email.value=''
    		 f.email.focus()
    		 return;

		}else if(f.address.value == ""){
			alert('주소를 입력해주세요.');
			f.address.focus();
			return;	
    	}else{
    		alert('가입을 환영합니다.');
    		f.submit();
    	} 
      }//validateCheck()