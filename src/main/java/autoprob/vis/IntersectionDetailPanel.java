package autoprob.vis;

import autoprob.go.Intersection;
import autoprob.go.Node;
import autoprob.katastruct.KataAnalysisResult;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.text.DecimalFormat;

public class IntersectionDetailPanel extends JPanel {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private JPanel gridPanel;

    public IntersectionDetailPanel() {
        super();

//        BoxLayout leftLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
//        setLayout(leftLayout);
        setLayout(new FlowLayout());
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 2));
        gridPanel.setPreferredSize(new Dimension(230, 100));

        addEntry("status", "no data");
        addEntry("foo", "bar");

//        addEntry("score: ", df.format(mistake.rootInfo.scoreLead));
//        addEntry("delta: ", df.format((mistake.rootInfo.scoreLead - prev.rootInfo.scoreLead)));
//        addEntry("to move: ", gameSource.getToMove() == Intersection.BLACK ? "black" : "white");

//        gridPanel.add(new JLabel("score: "));
//        gridPanel.add(new JLabel(df.format(mistake.rootInfo.scoreLead)));
//
//        gridPanel.add(new JLabel("delta: "));
//        gridPanel.add(new JLabel(df.format((mistake.rootInfo.scoreLead - prev.rootInfo.scoreLead))));
//        gridPanel.add(new JLabel("to move: "));
//        gridPanel.add(new JLabel((gameSource.getToMove() == Intersection.BLACK ? "black" : "white")));
        gridPanel.setBorder(new LineBorder(Color.BLUE));
        add(gridPanel);
        setPreferredSize(new Dimension(230, 150));
    }

    public void addEntry(String key, String value) {
        gridPanel.add(new JLabel(key));
        gridPanel.add(new JLabel(value));
    }
}
