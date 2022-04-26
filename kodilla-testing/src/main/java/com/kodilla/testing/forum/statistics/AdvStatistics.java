package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdvStatistics {

    private Statistics statistics;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersQuantity() {
            int usersQuantity = statistics.usersNames().size();
            return usersQuantity;
    }

    public int getPostsQuantity () {
            int postsQuantity = statistics.postsCount();
            return postsQuantity;
    }

    public int getCommentsQuantity () {
            int commentsQuantity = statistics.commentsCount();
            return commentsQuantity;
    }


    public double calculateAdvStatistics (Statistics statistics){

        return 0;
    }


}
