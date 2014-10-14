package ngat.phase2;

public class XRevision extends XPhase2Identity implements IRevision {

    public static final long serialVersionUID = -2190425631580753816L;

	long time;
	String editor, comment;
	
	public XRevision() {
		super();
	}
	
	public long getTime() {
	return time;
	}

	public String getEditor() {
		return editor;
	}

	public String getComment() {
		return comment;
	}

	public String toString() {  
		return this.getClass().getName() +" Time = "+time+", Ed="+editor+", ["+comment+"]";
		}

	/**
	 * @param comment The comment to set.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @param editor The editor to set.
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * @param time The time to set.
	 */
	public void setTime(long time) {
		this.time = time;
	}
	
}
