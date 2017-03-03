package ku.util;

public class CopyTask2 extends FileCopyTask {
	private final int ONEKB = 1024;

	public CopyTask2(String infile, String outfile) {
		super(infile, outfile);
	}

	@Override
	public void run() {
		FileUtil.copy(in, out, ONEKB);
	}

	@Override
	/** Describe the task */
	public String toString() {
		return String.format("Copy file 1KB a time.");
	}

}