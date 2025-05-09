package JAVAManage;

public class Stu2VO {

	private String name;
	private int korS;
	private int engS;
	private int matS;

	public Stu2VO() {
	}

	public int getKorS() {
		return korS;
	}
	public void setKorS(int korS) {
		this.korS = korS;
	}
	public int getEngS() {
		return engS;
	}

	public void setEngS(int engS) {
		this.engS = engS;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMatS(int matS) {
		this.matS = matS;
	}

	public int getMatS() {
		return matS;
	}



	public class Stu2Builder {
		private String name;
		private int korS;
		private int engS;
		private int matS;

		public Stu2Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Stu2Builder setKorS(int korS) {
			this.korS = korS;
			return this;
		}

		public Stu2Builder setEngS(int engS) {
			this.engS = engS;
			return this;
		}

		public Stu2Builder setMatS(int matS) {
			this.matS = matS;
			return this;
		}

		public Stu2VO build() {
			return new Stu2VO(this);
		}

	}

	public Stu2VO(Stu2Builder bd) {
		this.name = bd.name;
		this.korS = bd.korS;
		this.engS = bd.engS;
		this.matS = bd.matS;
	}

	public void print(Stu2VO st) {
		System.out.print("이름: " + st.getName());
		System.out.print(", 국어: " + st.getKorS());
		System.out.print(", 영어: " + st.getEngS());
		System.out.println(", 수학: " + st.getMatS());
	}

}
