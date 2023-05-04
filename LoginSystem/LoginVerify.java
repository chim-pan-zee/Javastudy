package sec03.exam01;

public class LoginVerify {
	
	public boolean loginSuccess(boolean loginStatus, String[] userId, String[] newId, String[] newPw, String idVerify, String pwVerify) {
		for (int i = 0; i < userId.length; i++) { 
			if (idVerify.equals(newId[i]) && pwVerify.equals(newPw[i])) {
				System.out.println("로그인 성공했습니다.");
				return true;
			}
		}
		return false;
	}
}
