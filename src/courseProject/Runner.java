package courseProject;

public class Runner {
    public static void main(String[] args) {
        Post post1 = new Post("Esquire","efdhghdsjfa");
        Post post2 = new Post("Alex", "dfdkjgjdkljcjcdklvncjkbnfdklbvmsklvnbdfklb");
        Post post3 = new Post("Esquire", "vkjdfkgfdsklafjdakgbladkgj;gfdkgfdljvdkl");
        Post post4 = new Post("Tony", "jkhlv453113jkhbkjhbb621vdkl");

        PostList postList = new PostList();
        postList.addPost(post1);
        postList.addPost(post2);
        postList.addPost(post3);
        postList.addPost(post4);
        postList.getPosts();

        System.out.println();
        System.out.println("Filtration");
        postList.userFilter("Tony");
    }
}
