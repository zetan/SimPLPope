/* The following code was generated by JFlex 1.4.3 on 13-5-23 下午7:59 */

package lex;

import java.io.*;
import java.util.ArrayList;
import syntax.*;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13-5-23 下午7:59 from the specification file
 * <tt>D:/lessons/programming languages/project/SimPLPope/src/lex/Lexer.flex</tt>
 */
public class Lexer implements Scanner{

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int C_COMMENT = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\40\2\0\1\41\26\0\1\37\3\0\1\32\1\33\1\27"+
    "\1\26\1\34\1\22\1\0\1\30\12\1\1\35\1\36\1\25\1\24"+
    "\1\23\2\0\32\2\4\0\1\3\1\0\1\17\2\2\1\14\1\10"+
    "\1\5\1\2\1\7\1\4\2\2\1\12\1\2\1\11\1\16\2\2"+
    "\1\20\1\13\1\6\1\21\1\2\1\15\3\2\3\0\1\31\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\15\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\1"+
    "\1\17\1\20\1\21\2\22\1\23\1\24\15\3\1\25"+
    "\1\3\1\26\1\3\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\3\1\35\4\3\1\36\1\3\1\37\1\40"+
    "\1\41\1\42\1\3\1\43\1\3\1\44\1\45\1\46"+
    "\1\47\1\50\1\3\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[82];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\356"+
    "\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc\0\u01fe"+
    "\0\u0220\0\u0242\0\104\0\104\0\104\0\104\0\104\0\u0264"+
    "\0\104\0\104\0\104\0\104\0\u0286\0\104\0\104\0\104"+
    "\0\104\0\u02a8\0\210\0\210\0\u02ca\0\u02ec\0\u030e\0\u0330"+
    "\0\u0352\0\u0374\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440"+
    "\0\u0462\0\210\0\u0484\0\210\0\u04a6\0\104\0\104\0\104"+
    "\0\104\0\104\0\210\0\u04c8\0\210\0\u04ea\0\u050c\0\u052e"+
    "\0\u0550\0\210\0\u0572\0\210\0\210\0\210\0\210\0\u0594"+
    "\0\210\0\u05b6\0\210\0\210\0\210\0\210\0\210\0\u05d8"+
    "\0\210\0\210";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[82];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\3\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\2\5\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\30\41\1\42\10\41\1\0\1\41\43\0\1\4\41\0"+
    "\21\5\21\0\4\5\1\43\3\5\1\44\10\5\21\0"+
    "\12\5\1\45\3\5\1\46\1\5\1\47\21\0\6\5"+
    "\1\50\7\5\1\51\1\52\1\5\21\0\7\5\1\53"+
    "\11\5\21\0\10\5\1\54\1\55\7\5\21\0\3\5"+
    "\1\56\11\5\1\57\3\5\21\0\7\5\1\60\11\5"+
    "\21\0\10\5\1\61\10\5\21\0\15\5\1\62\3\5"+
    "\21\0\6\5\1\63\12\5\21\0\17\5\1\64\1\5"+
    "\21\0\10\5\1\65\10\5\43\0\1\66\45\0\1\67"+
    "\36\0\1\70\10\0\1\71\34\0\1\72\12\0\5\5"+
    "\1\73\13\5\21\0\11\5\1\74\7\5\21\0\10\5"+
    "\1\75\10\5\21\0\7\5\1\76\11\5\21\0\3\5"+
    "\1\77\15\5\21\0\20\5\1\100\21\0\16\5\1\101"+
    "\2\5\21\0\13\5\1\102\5\5\21\0\12\5\1\103"+
    "\6\5\21\0\11\5\1\104\7\5\21\0\5\5\1\105"+
    "\13\5\21\0\5\5\1\106\13\5\21\0\13\5\1\107"+
    "\5\5\21\0\3\5\1\110\15\5\21\0\13\5\1\111"+
    "\5\5\21\0\12\5\1\112\6\5\21\0\10\5\1\113"+
    "\10\5\21\0\11\5\1\114\7\5\21\0\7\5\1\115"+
    "\11\5\21\0\13\5\1\116\5\5\21\0\7\5\1\117"+
    "\11\5\21\0\11\5\1\120\7\5\21\0\7\5\1\121"+
    "\11\5\21\0\7\5\1\122\11\5\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1530];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\17\1\5\11\1\1\4\11\1\1\4\11"+
    "\24\1\5\11\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[82];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
//these variables are defined static because they will be referenced in main, a static method
static int charCount = 0, wordCount = 0, lineCount = 0;
static java.util.List<Symbol> symbolList = new ArrayList<Symbol>();

public static void init(){}/**//* Just为了兼容手写版*/
    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn); 
    }
    private Symbol symbol(int type,Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }

public static void main(String [] args) throws IOException
{
	//create a scanner and use the scanner's yylex function
	//if you want standard input, System.in instead of new FileReader(args[0])
	Lexer lexer = new Lexer(new FileReader("src/TestProgram"));
	lexer.next_token();
	
}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 100) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { return symbol(sym.SEQUENCE);
          }
        case 43: break;
        case 28: 
          { return symbol(sym.FST);
          }
        case 44: break;
        case 5: 
          { return symbol(sym.GT);
          }
        case 45: break;
        case 13: 
          { return symbol(sym.RIGHT_PAREN);
          }
        case 46: break;
        case 30: 
          { return symbol(sym.END);
          }
        case 47: break;
        case 7: 
          { return symbol(sym.LT);
          }
        case 48: break;
        case 32: 
          { return symbol(sym.NEGATION);
          }
        case 49: break;
        case 1: 
          { charCount++;
          }
        case 50: break;
        case 35: 
          { return symbol(sym.AND);
          }
        case 51: break;
        case 2: 
          { return symbol(sym.INT, Integer.parseInt(yytext()));
          }
        case 52: break;
        case 25: 
          { return symbol(sym.ASSIGN);
          }
        case 53: break;
        case 37: 
          { return symbol(sym.TAIL);
          }
        case 54: break;
        case 34: 
          { return symbol(sym.SND);
          }
        case 55: break;
        case 27: 
          { yybegin(YYINITIAL);
          }
        case 56: break;
        case 8: 
          { return symbol(sym.PLUS);
          }
        case 57: break;
        case 23: 
          { return symbol(sym.ARROW);
          }
        case 58: break;
        case 38: 
          { return symbol(sym.TRUE);
          }
        case 59: break;
        case 24: 
          { yybegin(C_COMMENT);
          }
        case 60: break;
        case 21: 
          { return symbol(sym.DO);
          }
        case 61: break;
        case 9: 
          { return symbol(sym.TIMES);
          }
        case 62: break;
        case 40: 
          { return symbol(sym.ELSE);
          }
        case 63: break;
        case 36: 
          { return symbol(sym.THEN);
          }
        case 64: break;
        case 42: 
          { return symbol(sym.WHILE);
          }
        case 65: break;
        case 19: 
          { return symbol(sym.IF);
          }
        case 66: break;
        case 29: 
          { return symbol(sym.FUN);
          }
        case 67: break;
        case 12: 
          { return symbol(sym.LEFT_PAREN);
          }
        case 68: break;
        case 22: 
          { return symbol(sym.OR);
          }
        case 69: break;
        case 20: 
          { return symbol(sym.IN);
          }
        case 70: break;
        case 6: 
          { return symbol(sym.EQ);
          }
        case 71: break;
        case 17: 
          { charCount++; lineCount++;
          }
        case 72: break;
        case 39: 
          { return symbol(sym.HEAD);
          }
        case 73: break;
        case 33: 
          { return symbol(sym.LET);
          }
        case 74: break;
        case 31: 
          { return symbol(sym.NIL);
          }
        case 75: break;
        case 3: 
          { return symbol(sym.VAR, new String(yytext()));
          }
        case 76: break;
        case 11: 
          { return symbol(sym.UNARY_MINUS);
          }
        case 77: break;
        case 16: 
          { return symbol(sym.END_OF_PROGRAM);
          }
        case 78: break;
        case 4: 
          { return symbol(sym.MINUS);
          }
        case 79: break;
        case 26: 
          { return symbol(sym.APPEND);
          }
        case 80: break;
        case 10: 
          { return symbol(sym.DIVIDE);
          }
        case 81: break;
        case 14: 
          { return symbol(sym.COMMA);
          }
        case 82: break;
        case 41: 
          { return symbol(sym.FALSE);
          }
        case 83: break;
        case 18: 
          { 
          }
        case 84: break;
        case -1: return  symbol(sym.EOF);
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
