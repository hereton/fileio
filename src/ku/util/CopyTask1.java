package ku.util;

public class CopyTask1 extends FileCopyTask {

	public CopyTask1(String infile, String outfile) {
		super(infile, outfile);
	}

	@Override
	public void run() {
		FileUtil.copy(in, out);
	}

	@Override
	/** Describe the task */
	public String toString() {
		return String.format("Copy file one byte at a time.");
	}

}
