package JAVAManage;

public class Stu2VO {

	public Stu2VO(Stu2Builder bd){this.name=bd.name;this.korS=bd.korS;this.engS=bd.engS;this.matS=bd.matS;}
	
	private String name;
	private int korS;
	private int engS;
	private int matS;

	public Stu2VO() {
	}

	public Stu2VO(Stu2Builder bd) {
		this.name = bd.name;
		this.korS = bd.korS;
		this.engS = bd.engS;
		this.matS = bd.matS;
	}

	public int getKorS() {
		return korS;
	}

	public int getEngS() {
		return engS;
	}

	public int getMatS() {
		return matS;
	}

	public void setKorS(int korS) {
		this.korS = korS;
	}

	public void setEngS(int engS) {
		this.engS = engS;
	}

}
