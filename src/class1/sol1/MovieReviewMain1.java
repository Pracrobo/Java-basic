package class1.sol1;


public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview incention = new MovieReview();
        incention.title = "인셉션";
        incention.review="안생은 무한 루프";


        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        System.out.println("영화 제목: "+incention.title + ", 리뷰: "+ incention.review);
        System.out.println("영화 제목: "+aboutTime.title + ", 리뷰: "+ aboutTime.review);

    }
}
