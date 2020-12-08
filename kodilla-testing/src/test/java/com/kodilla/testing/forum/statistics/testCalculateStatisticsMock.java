package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testCalculateStatisticsMock {

    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Marek");
        usersNames.add("Ewelina");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //when
        when(statisticsMock.postsCount()).thenReturn(0);
        //then
        Assertions.assertEquals(0, cas.averagePostPerUser(), 0);
        Assertions.assertEquals(0, cas.averageCommentsPerUser(), 0);
        Assertions.assertEquals(0, cas.averageCommentsPerPost(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsThousand() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Marek");
        usersNames.add("Ewelina");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //when
        when(statisticsMock.postsCount()).thenReturn(1000);
        //then
        Assertions.assertEquals(500, cas.averagePostPerUser(), 0);
        Assertions.assertEquals(0, cas.averageCommentsPerPost(), 0);
        Assertions.assertEquals(0, cas.averageCommentsPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsCountIsZero() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Marek");
        usersNames.add("Ewelina");
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //when
        when(statisticsMock.commentsCount()).thenReturn(0);
        //then
        Assertions.assertEquals(0, cas.averageCommentsPerUser(), 0);
        Assertions.assertEquals(0, cas.averageCommentsPerPost(), 0);
        Assertions.assertEquals(5, cas.averagePostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsMorePostsThenComments() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Marek");
        usersNames.add("Ewelina");
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //when
        when(statisticsMock.commentsCount()).thenReturn(10);
        //then
        Assertions.assertEquals(5, cas.averageCommentsPerUser(), 0);
        Assertions.assertEquals(0, cas.averageCommentsPerPost(), 0.0);
        Assertions.assertEquals(50, cas.averagePostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsMoreCommentsThanPosts() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Marek");
        usersNames.add("Ewelina");
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //when
        when(statisticsMock.commentsCount()).thenReturn(100);
        //then
        Assertions.assertEquals(50, cas.averageCommentsPerUser(), 0);
        Assertions.assertEquals(10, cas.averageCommentsPerPost(), 0);
        Assertions.assertEquals(5, cas.averagePostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersCountIsZero() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Marek");
        usersNames.add("Ewelina");
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //when
        usersNames.remove(1);
        usersNames.remove(0);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //then
        Assertions.assertEquals(0, cas.averageCommentsPerUser(), 0);
        Assertions.assertEquals(10, cas.averageCommentsPerPost(), 0);
        Assertions.assertEquals(0, cas.averagePostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersCountIsOneHundread () {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        calculateAdvStatistics cas = new calculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
//        usersNames.add("Marek");
//        usersNames.add("Ewelina");
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //when
        for (int n = 0; n < 100; n++) {
            usersNames.add("user" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //then
        Assertions.assertEquals(1, cas.averageCommentsPerUser(), 0);
        Assertions.assertEquals(10, cas.averageCommentsPerPost(), 0);
        Assertions.assertEquals(0, cas.averagePostPerUser(), 0);
    }
}
