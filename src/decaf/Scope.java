package decaf;

import java.util.Hashtable;

public class Scope extends Hashtable<String, ScopeElement> {
    final Scope parent;

    public Scope(Scope parent) {
        this.parent=parent;

    }

    public ScopeElement find(String name){
        ScopeElement found = get(name);
        if(found!=null){
            return found;
        }
        else if (parent==null){
            return null;
        }
        else
            return parent.find(name);
    }
}
