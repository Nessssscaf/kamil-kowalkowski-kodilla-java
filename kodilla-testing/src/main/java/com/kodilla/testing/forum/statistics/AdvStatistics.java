package com.kodilla.testing.forum.statistics;

public class AdvStatistics {

    private Statistics statistics;
    private double usersQuantity;
    private double postsQuantity;
    private double commentsQuantity;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics (Statistics statistics){

        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if (usersQuantity == 0) {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
        } else {
            averageNumberOfPostsPerUser = postsQuantity / usersQuantity;
            averageNumberOfCommentsPerUser = commentsQuantity / usersQuantity;
        }
        if (postsQuantity == 0) {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerPost = 0;
        } else {
            averageNumberOfCommentsPerPost = commentsQuantity / postsQuantity;
        }
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Users quantity is " + usersQuantity);
        System.out.println("Posts quantity is " + postsQuantity);
        System.out.println("Comments quantity is " + commentsQuantity);
        System.out.println("Average number of posts per user is " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user is " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post is " + averageNumberOfCommentsPerPost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdvStatistics that = (AdvStatistics) o;

        if (Double.compare(that.usersQuantity, usersQuantity) != 0) return false;
        if (Double.compare(that.postsQuantity, postsQuantity) != 0) return false;
        if (Double.compare(that.commentsQuantity, commentsQuantity) != 0) return false;
        if (Double.compare(that.averageNumberOfPostsPerUser, averageNumberOfPostsPerUser) != 0) return false;
        if (Double.compare(that.averageNumberOfCommentsPerUser, averageNumberOfCommentsPerUser) != 0)
            return false;
        if (Double.compare(that.averageNumberOfCommentsPerPost, averageNumberOfCommentsPerPost) != 0)
            return false;
        return statistics != null ? statistics.equals(that.statistics) : that.statistics == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = statistics != null ? statistics.hashCode() : 0;
        temp = Double.doubleToLongBits(usersQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(postsQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(commentsQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageNumberOfPostsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageNumberOfCommentsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageNumberOfCommentsPerPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}