package dto;

import java.util.Date;
import java.util.Objects;

public class Review {
	private int review_num;
	private String user_id;
	private String nickname;
	private int cafe_num;
	private String content;
	private float rating;
	private Date date;
	
	public Review() {
		super();
	}

	public Review(String user_id, String nickname, int cafe_num, String content, float rating) {
		super();
		this.user_id = user_id;
		this.nickname = nickname;
		this.cafe_num = cafe_num;
		this.content = content;
		this.rating = rating;
	}

	public int getReview_num() {
		return review_num;
	}

	public void setReview_num(int review_num) {
		this.review_num = review_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getCafe_num() {
		return cafe_num;
	}

	public void setCafe_num(int cafe_num) {
		this.cafe_num = cafe_num;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "ReviewDTO [review_num=" + review_num + ", user_id=" + user_id + ", nickname=" + nickname + ", cafe_num="
				+ cafe_num + ", content=" + content + ", rating=" + rating + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(content, other.content) && Objects.equals(user_id, other.user_id);
	}
	
	
}
