package com.kodilla.testing.forum.statistics;

public class AppStatistics {
    private int allUsers;
    private int allPosts;
    private int allComments;
    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public AppStatistics(int allUsers, int allPosts, int allComments, double averagePostPerUser, double averageCommentPerUser, double averageCommentPerPost) {
        this.allUsers = allUsers;
        this.allPosts = allPosts;
        this.allComments = allComments;
        this.averagePostPerUser = averagePostPerUser;
        this.averageCommentPerUser = averageCommentPerUser;
        this.averageCommentPerPost = averageCommentPerPost;
    }

    public int getAllUsers() {
        return allUsers;
    }

    public int getAllPosts() {
        return allPosts;
    }

    public int getAllComments() {
        return allComments;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

    }
}
