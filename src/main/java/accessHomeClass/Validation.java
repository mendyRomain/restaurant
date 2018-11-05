package accessHomeClass;

public class Validation {

		private boolean ok;
		private String phrase;
		
		public Validation() {
			super();
		}

		public Validation(boolean ok, String phrase) {
			super();
			this.ok = ok;
			this.phrase = phrase;
		}

		public boolean isOk() {
			return ok;
		}

		public void setOk(boolean ok) {
			this.ok = ok;
		}

		public String getPhrase() {
			return phrase;
		}

		public void setPhrase(String phrase) {
			this.phrase = phrase;
		}

		@Override
		public String toString() {
			return "Validation [ok=" + ok + ", phrase=" + phrase + "]";
		}
		
		
		
}
