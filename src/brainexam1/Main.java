package brainexam1;

public class Main {
	public static void main(String[] args) {
		Model model = new Model();
		Controller controller = new Controller(model);
		View view = new View(controller,model);
		view.setSize(616,240);
		view.setVisible(true);
	}
}
