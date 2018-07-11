package domain;

public class ExamBean {
	protected String memId,examSeq, subSeq,score,month,recordSeq;

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getExamSeq() {
		return examSeq;
	}

	public void setExamSeq(String examSeq) {
		this.examSeq = examSeq;
	}

	public String getSubSeq() {
		return subSeq;
	}

	public void setSubSeq(String subSeq) {
		this.subSeq = subSeq;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getRecordSeq() {
		return recordSeq;
	}

	public void setRecordSeq(String recordSeq) {
		this.recordSeq = recordSeq;
	}

	@Override
	public String toString() {
		return "시험정보 [멤버id=" + memId + ", 시험번호=" + examSeq + ", 과목번호=" + subSeq + ", 점수=" + score
				+ ", 월=" + month + ", 성적표번호=" + recordSeq + "]";
	} 
	
	
}
