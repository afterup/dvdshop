package com.movie.model.vo;

public class MovieInfo {
	private int movieid;
	private String movienm;
	private String movieimg;
	private String moviedesc;
	private String genrenm;
	private String supervison;
	private String watchGradeNm;
	private int dvdamount;
	
	public MovieInfo(int movieid, String movienm, String movieimg, String moviedesc, String genrenm, String supervison,
			String watchGradeNm, int dvdamount) {
		super();
		this.movieid = movieid;
		this.movienm = movienm;
		this.movieimg = movieimg;
		this.moviedesc = moviedesc;
		this.genrenm = genrenm;
		this.supervison = supervison;
		this.watchGradeNm = watchGradeNm;
		this.dvdamount = dvdamount;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieid=" + movieid + ", movienm=" + movienm + ", movieimg=" + movieimg + ", moviedesc="
				+ moviedesc + ", genrenm=" + genrenm + ", supervison=" + supervison + ", watchGradeNm=" + watchGradeNm
				+ ", dvdamount=" + dvdamount + "]";
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMovienm() {
		return movienm;
	}

	public void setMovienm(String movienm) {
		this.movienm = movienm;
	}

	public String getMovieimg() {
		return movieimg;
	}

	public void setMovieimg(String movieimg) {
		this.movieimg = movieimg;
	}

	public String getMoviedesc() {
		return moviedesc;
	}

	public void setMoviedesc(String moviedesc) {
		this.moviedesc = moviedesc;
	}

	public String getGenrenm() {
		return genrenm;
	}

	public void setGenrenm(String genrenm) {
		this.genrenm = genrenm;
	}

	public String getSupervison() {
		return supervison;
	}

	public void setSupervison(String supervison) {
		this.supervison = supervison;
	}

	public String getWatchGradeNm() {
		return watchGradeNm;
	}

	public void setWatchGradeNm(String watchGradeNm) {
		this.watchGradeNm = watchGradeNm;
	}

	public int getDvdamount() {
		return dvdamount;
	}

	public void setDvdamount(int dvdamount) {
		this.dvdamount = dvdamount;
	}
	
	

}
