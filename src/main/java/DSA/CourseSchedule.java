package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];

            graph.get(pre).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] ==0) {
                queue.offer(i);
            }
        }
        int count = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            count++;

            for (int next : graph.get(cur)) {
                indegree[next]--;

                if (indegree[next] ==0) {
                    queue.offer(next);
                }
            }
        }
        return count == numCourses;
    }
}
