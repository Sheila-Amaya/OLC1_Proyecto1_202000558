
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import Errores.Excepcion;
import Errores.ErrSin;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\002\004\000\002\002\006\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\005\011" +
    "\000\002\006\004\000\002\006\003\000\002\010\005\000" +
    "\002\010\005\000\002\010\005\000\002\010\005\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\004\025\005\001\002\000\004\002\041\001" +
    "\002\000\004\027\010\001\002\000\006\026\037\027\010" +
    "\001\002\000\006\026\ufffe\027\ufffe\001\002\000\004\024" +
    "\012\001\002\000\006\026\ufffd\027\ufffd\001\002\000\004" +
    "\030\013\001\002\000\004\023\014\001\002\000\012\031" +
    "\020\032\015\033\022\034\016\001\002\000\024\017\ufff5" +
    "\020\ufff5\021\ufff5\022\ufff5\026\ufff5\031\ufff5\032\ufff5\033" +
    "\ufff5\034\ufff5\001\002\000\024\017\ufff2\020\ufff2\021\ufff2" +
    "\022\ufff2\026\ufff2\031\ufff2\032\ufff2\033\ufff2\034\ufff2\001" +
    "\002\000\014\026\033\031\020\032\015\033\022\034\016" +
    "\001\002\000\024\017\ufff4\020\ufff4\021\ufff4\022\ufff4\026" +
    "\ufff4\031\ufff4\032\ufff4\033\ufff4\034\ufff4\001\002\000\024" +
    "\017\023\020\024\021\026\022\025\026\ufffa\031\ufffa\032" +
    "\ufffa\033\ufffa\034\ufffa\001\002\000\024\017\ufff3\020\ufff3" +
    "\021\ufff3\022\ufff3\026\ufff3\031\ufff3\032\ufff3\033\ufff3\034" +
    "\ufff3\001\002\000\012\031\020\032\015\033\022\034\016" +
    "\001\002\000\012\031\020\032\015\033\022\034\016\001" +
    "\002\000\012\031\020\032\015\033\022\034\016\001\002" +
    "\000\012\031\020\032\015\033\022\034\016\001\002\000" +
    "\024\017\ufff7\020\ufff7\021\ufff7\022\ufff7\026\ufff7\031\ufff7" +
    "\032\ufff7\033\ufff7\034\ufff7\001\002\000\024\017\ufff6\020" +
    "\ufff6\021\ufff6\022\ufff6\026\ufff6\031\ufff6\032\ufff6\033\ufff6" +
    "\034\ufff6\001\002\000\024\017\ufff8\020\ufff8\021\026\022" +
    "\025\026\ufff8\031\ufff8\032\ufff8\033\ufff8\034\ufff8\001\002" +
    "\000\024\017\ufff9\020\ufff9\021\026\022\025\026\ufff9\031" +
    "\ufff9\032\ufff9\033\ufff9\034\ufff9\001\002\000\004\004\035" +
    "\001\002\000\024\017\023\020\024\021\026\022\025\026" +
    "\ufffb\031\ufffb\032\ufffb\033\ufffb\034\ufffb\001\002\000\006" +
    "\026\ufffc\027\ufffc\001\002\000\006\026\uffff\027\uffff\001" +
    "\002\000\004\025\040\001\002\000\004\002\000\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\004\002\003\001\001\000\002\001\001\000" +
    "\010\003\005\004\006\005\010\001\001\000\006\004\035" +
    "\005\010\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\016\010\020\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\033\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\031\001\001\000" +
    "\004\010\030\001\001\000\004\010\027\001\001\000\004" +
    "\010\026\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    // clases, objetos, variables, listas, etc.
    public List<String> salidas = new ArrayList<String>();

    // errores
    public ArrayList<ErrSin> Errores = new ArrayList();

    // Método al que se llama automáticamente ante algún error sintáctico.
    public void syntax_error(Symbol s) {
        Errores.add(new ErrSin(s.value, s.left, s.right));
    }

    // Método al que se llama automáticamente ante algún error sintáctico
    // en el que ya no es posible una recuperación de errores.
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        System.out.println("Error sintáctico irrecuperable en la Línea " + (s.left) + " Columna " + s.right + ". Componente " + s.value + " no reconocido.");
    }

    public String getErrores() {
        return Errores.stream().map(Object::toString).collect(Collectors.joining("\n-> "));
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= PROGRAM declaraciones END PROGRAM 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declaraciones ::= declaraciones declaracion 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaraciones",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaraciones ::= declaracion 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaraciones",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaracion ::= imprimir 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // imprimir ::= CONSOLE ACCESO PRINT ASIGNACION listas END PTCOMA 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("imprimir",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // listas ::= listas expresion 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("listas",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // listas ::= expresion 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("listas",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expresion ::= expresion MAS expresion 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a + " + " + b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= expresion MENOS expresion 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a + " - " + b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= expresion POR expresion 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a + " * " + b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= expresion DIV expresion 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = a + " / " + b; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= ID 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= CADENA 
            {
              String RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = str;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= ENTERO 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = i;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= DOUBLE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
