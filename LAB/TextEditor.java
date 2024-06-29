
interface Editor {
    public void text();

}

abstract class DecoratedText implements Editor {
    protected Editor decoreatedText ; 
    public DecoratedText(Editor editor){
        this.decoreatedText = editor;
    }
    public void text(){}
}
class SimpleText implements Editor {
    @Override
    public void text(){
        System.out.println("This is a simple text");
    }
}

class BoldText extends  DecoratedText {
    public BoldText(Editor editor){
        super(editor);
    }

    @Override
    public void text(){
        System.out.println("This is a bold text");
    }
}
class Italic extends DecoratedText {
    public Italic(Editor editor){
        super(editor);
    }
    @Override
    public void text(){
        System.out.println("This is a italic text");
    }
}

class Underline extends DecoratedText{
    public Underline(Editor editor){
        super(editor);
    }
    @Override
    public void text(){
        System.out.println("There is an Underline in these texts");
    }
}

class SyntaxHighlighting extends DecoratedText{
    public SyntaxHighlighting(Editor editor){
        super(editor);
    }
    @Override
    public void text(){
        System.out.println("There is a pretty syntax highlights in these texts");
    }
}

class SpellChecking extends DecoratedText {
    public SpellChecking(Editor editor){
        super(editor);
    }
    @Override
    public void text(){
        System.out.println("There is spellcheckingsystem in these texts");
    }
}
public class TextEditor {

    public static void main(String[] args) {
        Editor simpleText = new SimpleText();
        simpleText.text();

        Editor boldText = new BoldText(simpleText);
        boldText.text();

        SyntaxHighlighting syntax = new SyntaxHighlighting(boldText);
        syntax.text();

        SpellChecking fullfunctional = new SpellChecking(syntax);
        fullfunctional.text();
    }
    
}
