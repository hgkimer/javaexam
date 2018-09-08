package ExceptionExam;

class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException e) {
			System.out.println("에러 메세지 : "+ e.getMessage());
			e.printStackTrace();
			System.gc();//가비지 콜렉터를 실행
			System.out.println("메모리르 확보하는 작업을 실행했습니다. 설치를 다시 진행 하세요.");
		}finally {
			deleteFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	static void copyFiles() {
		System.out.println("파일을 복사하였습니다.");
	}
	static void deleteFiles() {
		System.out.println("임시파일을 제거하였습니다.");
	}
	static boolean enoughSpace() {
		return true;
	}
	static boolean enoughMemory() {
		return false;
	}
}
class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
