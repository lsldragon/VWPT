package UI;

import java.util.ArrayList;

import org.apache.commons.lang3.time.StopWatch;

public class Watch {

	static StopWatch timer = new StopWatch();

	public static double splitTime;
	public static double endTime;

	public static ArrayList<Double> timesRecorded = new ArrayList<Double>(); // 记录时间
	public static ArrayList<Double> finalTime = new ArrayList<Double>(1); // 记录最终时间

	protected static ArrayList<Double> getTimesRecorded() {
		return timesRecorded;
	}

	protected static ArrayList<Double> getFinalTime() {
		return finalTime;
	}

	protected static double getSplitTime() {
		return splitTime;
	}

	protected static double getEndTime() {
		return endTime;
	}

	public Watch() {
		super();
	}

	public static void startWatch() {

		if (!timer.isStarted()) {
			timer.reset();
			timer.start();

		} else {
			return;
		}
	}

	public static void splitTimer() {

		if (!timer.isStarted()) {
			return;
		}

		timer.split();
		splitTime = (double) (timer.getTime()) / 1000;
		timesRecorded.add(splitTime);

	}

	public static void stopTimer() {

		if (!timer.isStarted()) {
			return;
		}

		timer.stop();

		endTime = (double) (timer.getTime()) / 1000;
		finalTime.add(endTime);

	}

	public static void resetTimer() {
		timer.reset();
	}

}
