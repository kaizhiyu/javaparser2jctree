package stave.java.ast;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.JCTree.JCContinue;
import com.sun.tools.javac.util.Name;

//import com.sun.tools.javac.util.List;
//import com.sun.tools.javac.code.Symbol;
//import com.sun.tools.javac.code.Scope.ImportScope;
//import com.sun.tools.javac.code.BoundKind;

public class AJCContinue extends JCContinue implements JavaParserComments {

    public String comment;

    public AJCContinue(Name label, JCTree target) {
        super(label, target);
    }

    public AJCContinue(JCContinue ltree) {
        super(ltree.label, ltree.target);
    }

    public AJCContinue(JCContinue ltree, String lcomment) {
        this(ltree);
        setComment(lcomment);
    }

    public boolean hasComment() {
        return comment != null;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String lcomment) {
        comment = lcomment;
    }
}

