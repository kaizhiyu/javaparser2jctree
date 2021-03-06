package stave.java.ast;

import com.sun.tools.javac.code.Symbol.MethodSymbol;
import com.sun.tools.javac.tree.JCTree.JCMethodDecl;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;

//import import com.sun.tools.javac.tree.JCTree;
//import com.sun.tools.javac.code.Scope.ImportScope;
//import com.sun.tools.javac.code.BoundKind;

public class AJCMethodDecl extends JCMethodDecl implements JavaParserComments {

    public String comment;

    public AJCMethodDecl(JCModifiers mods,
                         Name name,
                         JCExpression restype,
                         List<JCTypeParameter> typarams,
                         JCVariableDecl recvparam,
                         List<JCVariableDecl> params,
                         List<JCExpression> thrown,
                         JCBlock body,
                         JCExpression defaultValue,
                         MethodSymbol sym) {
        super(mods, name, restype, typarams, recvparam, params, thrown, body, defaultValue, sym);
    }

    public AJCMethodDecl(JCMethodDecl ltree) {
        super(ltree.mods, ltree.name, ltree.restype, ltree.typarams, ltree.recvparam, ltree.params, ltree.thrown, ltree.body, ltree.defaultValue, ltree.sym);
    }

    public AJCMethodDecl(JCMethodDecl ltree, String lcomment) {
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

