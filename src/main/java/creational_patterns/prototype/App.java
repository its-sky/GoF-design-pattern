package creational_patterns.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        GithubIssue clone = (GithubIssue) githubIssue.clone(); // Default는 Shallow copy

        String url = githubIssue.getUrl();
        System.out.println(url);
        String url2 = clone.getUrl();
        System.out.println(url2);
    }

}
