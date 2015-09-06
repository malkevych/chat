import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class ChatBot extends JFrame implements KeyListener {
	Tester t = new Tester();
	JPanel p = new JPanel();
	JTextArea dialog = new JTextArea(20, 50);
	JTextArea input = new JTextArea(1, 50);
	JScrollPane scroll = new JScrollPane(dialog,
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	public static void main(String[] args) {
		new ChatBot();
	}

	public ChatBot() {
		super("Chat Bot");
		setSize(600, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		dialog.setEditable(false);
		input.addKeyListener(this);

		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(0, 204, 255));
		add(p);

		setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			input.setEditable(false);
			String quote = input.getText();
			input.setText("");
			addText("-->Ви:\t" + quote);
			addText("\n-->Варя\t" + t.getAnswer(quote) + "\n");
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			input.setEditable(true);
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void addText(String str) {
		dialog.setText(dialog.getText() + str);
	}
}