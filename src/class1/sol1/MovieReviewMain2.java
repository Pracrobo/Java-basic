package class1.sol1;


public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview incention = new MovieReview();
        incention.title = "인셉션";
        incention.review="안생은 무한 루프";
        reviews[0] = incention;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: "+review.title + ", 리뷰: "+ review.review);
        }
    }
}
