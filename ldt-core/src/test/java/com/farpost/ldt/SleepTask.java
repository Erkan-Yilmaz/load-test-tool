package com.farpost.ldt;

import static java.lang.Thread.sleep;

public class SleepTask extends AbstractTask {

	private final long delay;

	public SleepTask(long delay) {
		this.delay = delay;
	}

  public SleepTask() {
    delay = 300;
  }

  public void execute() throws Exception {
		sleep(delay);
	}
}
