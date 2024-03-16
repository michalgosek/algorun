package com.michalgosek.problems;

import java.util.Arrays;

public class FindMinimumTimeToFinishAllJobs {
    public static int Solution(int[] jobsTime, int numOfCoworkers) {
        var left = Arrays.stream(jobsTime).min().orElseThrow();
        var right = Arrays.stream(jobsTime).sum();
        var minimumTime = -1;
        while (left <= right) {
            var timeLimit = left + (right - left) / 2;
            if (IsEstimatedTimeLimitSufficientToFinishJobs(jobsTime, timeLimit, numOfCoworkers)) {
                minimumTime = timeLimit;
                right = timeLimit - 1;
            } else {
                left = timeLimit + 1;
            }
        }
        return minimumTime;
    }

    private static boolean IsEstimatedTimeLimitSufficientToFinishJobs(int[] jobsTime, int timeLimit, int numOfCoworkers) {
        var workersCounter = 0;
        var totalTimeSpentOnWork = 0;
        for (var jobTime : jobsTime) {
            if (totalTimeSpentOnWork + jobTime > timeLimit) {
                ++workersCounter;
                timeLimit = 0;
            }
            totalTimeSpentOnWork += jobTime;
        }

        if (totalTimeSpentOnWork != 0) ++workersCounter;

        return workersCounter <= numOfCoworkers;
    }
}
