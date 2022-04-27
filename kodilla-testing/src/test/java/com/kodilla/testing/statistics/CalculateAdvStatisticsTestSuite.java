package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CalculateAdvStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Statistics statisticsMock;

    @Nested
    @DisplayName("Tests number of posts")
    class TestNumberPosts {

        @Test
        void testWhenTheNumberOfPostsIsZero() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();
            for (int i = 0; i <= 100; i++) {
                usersNames.add("user" + i);
            }
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(746);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenZeroPosts = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenZeroPosts = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenZeroPosts = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(0, averageNumberOfPostsPerUserWhenZeroPosts);
            assertEquals(7.3861386138613865, averageNumberOfCommentsPerUserWhenZeroPosts);
            assertEquals(0, averageNumberOfCommentsPerPostWhenZeroPosts);
        }

        @Test
        void testWhenTheNumberOfPostsIsThousand() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                usersNames.add("user" + i);
            }
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(746);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenThousandPosts = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenThousandPosts = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenThousandPosts = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(10, averageNumberOfPostsPerUserWhenThousandPosts);
            assertEquals(7.46, averageNumberOfCommentsPerUserWhenThousandPosts);
            assertEquals(0.746, averageNumberOfCommentsPerPostWhenThousandPosts);
        }
    }

    @Nested
    @DisplayName("Tests number of comments")
    class TestNumberComments {

        @Test
        void testWhenTheNumberOfCommentsIsZero() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                usersNames.add("user" + i);
            }
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenCommentsIsZero = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenCommentsIsZero = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenCommentsIsZero = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(10, averageNumberOfPostsPerUserWhenCommentsIsZero);
            assertEquals(0, averageNumberOfCommentsPerUserWhenCommentsIsZero);
            assertEquals(0, averageNumberOfCommentsPerPostWhenCommentsIsZero);
        }

        @Test
        void testWhenTheNumberOfCommentsIsLessThanPosts() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                usersNames.add("user" + i);
            }
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenCommentsIsLessThanPosts = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenCommentsIsLessThanPosts = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenCommentsIsLessThanPosts = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(10, averageNumberOfPostsPerUserWhenCommentsIsLessThanPosts);
            assertEquals(0.5, averageNumberOfCommentsPerUserWhenCommentsIsLessThanPosts);
            assertEquals(0.05, averageNumberOfCommentsPerPostWhenCommentsIsLessThanPosts);
        }

        @Test
        void testWhenTheNumberOfCommentsIsBiggerThanPosts() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                usersNames.add("user" + i);
            }
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(1600);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenCommentsIsBiggerThanPosts = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenCommentsIsBiggerThanPosts = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenCommentsIsBiggerThanPosts = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(10, averageNumberOfPostsPerUserWhenCommentsIsBiggerThanPosts);
            assertEquals(16, averageNumberOfCommentsPerUserWhenCommentsIsBiggerThanPosts);
            assertEquals(1.6, averageNumberOfCommentsPerPostWhenCommentsIsBiggerThanPosts);
        }
    }

    @Nested
    @DisplayName("Tests number of users")
    class TestNumberUsers {

        @Test
        void testWhenTheNumberOfUsersIsZero() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();

            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(1600);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenUsersIsZero = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenUsersIsZero = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenUsersIsZero = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(0, averageNumberOfPostsPerUserWhenUsersIsZero);
            assertEquals(0, averageNumberOfCommentsPerUserWhenUsersIsZero);
            assertEquals(1.6, averageNumberOfCommentsPerPostWhenUsersIsZero);
        }

        @Test
        void testWhenTheNumberOfUsersIsHundred() {

            // Given
            Statistics statisticsMock = mock(Statistics.class);
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                usersNames.add("user" + i);
            }
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(1600);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            advStatistics.calculateAdvStatistics(statisticsMock);

            // When
            double averageNumberOfPostsPerUserWhenUsersIsHundred = advStatistics.getAverageNumberOfPostsPerUser();
            double averageNumberOfCommentsPerUserWhenUsersIsHundred = advStatistics.getAverageNumberOfCommentsPerUser();
            double averageNumberOfCommentsPerPostWhenUsersIsHundred = advStatistics.getAverageNumberOfCommentsPerPost();

            // Then
            assertEquals(10, averageNumberOfPostsPerUserWhenUsersIsHundred);
            assertEquals(16, averageNumberOfCommentsPerUserWhenUsersIsHundred);
            assertEquals(1.6, averageNumberOfCommentsPerPostWhenUsersIsHundred);
        }
    }
}

