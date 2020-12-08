package com.kodilla.testing.forum.statistics;

public class calculateAdvStatistics {

    Statistics statistics;

    public calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUserCount() {
        return this.statistics.usersNames().size();
    }

    public int getPostsCount() {
        return this.statistics.postsCount();
    }

    public int getCommentsCount() {
        return this.statistics.commentsCount();
    }

    public double averagePostPerUser() {
        if (getUserCount() == 0) {
            return 0;
        } else {
            return getPostsCount() / getUserCount();
        }
    }

    public double averageCommentsPerUser() {
        if (getUserCount() == 0) {
            return 0;
        } else {
            return getCommentsCount() / getUserCount();
        }
    }

    public double averageCommentsPerPost() {
        if (getPostsCount() == 0) {
            return 0;
        } else {
            return getCommentsCount() / getPostsCount();
        }
    }
}
