// DO NOT EDIT
// Generated by JFlex 1.9.0 http://jflex.de/
// source: src/main/jflex/itcm/Lexer.flex

package itcm;
import java_cup.runtime.Symbol;


@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u1100\1\u1200\1\u1300\1\u1400\1\u1100\1\u1500\1\u1600"+
    "\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u1c00\1\u1100\1\u1d00"+
    "\1\u1e00\1\u1f00\12\u2000\1\u2100\1\u2200\1\u2300\1\u2000\1\u2400"+
    "\1\u2500\2\u2000\31\u1100\1\u2600\121\u1100\1\u2700\4\u1100\1\u2800"+
    "\1\u1100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\1\u2e00\53\u1100"+
    "\1\u2f00\10\u3000\31\u2000\1\u1100\1\u3100\1\u3200\1\u1100\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u2000\1\u3700\1\u3800\1\u3900\1\u3a00"+
    "\1\u1100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100"+
    "\1\u2000\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800"+
    "\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u2000\1\u4e00\1\u4f00"+
    "\1\u5000\1\u2000\3\u1100\1\u5100\1\u5200\1\u5300\12\u2000\4\u1100"+
    "\1\u5400\17\u2000\2\u1100\1\u5500\41\u2000\2\u1100\1\u5600\1\u5700"+
    "\2\u2000\1\u5800\1\u5900\27\u1100\1\u5a00\2\u1100\1\u5b00\45\u2000"+
    "\1\u1100\1\u5c00\1\u5d00\11\u2000\1\u5e00\27\u2000\1\u5f00\1\u6000"+
    "\1\u6100\1\u6200\11\u2000\1\u6300\1\u6400\5\u2000\1\u6500\1\u6600"+
    "\4\u2000\1\u6700\21\u2000\246\u1100\1\u6800\20\u1100\1\u6900\1\u6a00"+
    "\25\u1100\1\u6b00\34\u1100\1\u6c00\14\u2000\2\u1100\1\u6d00\u0e05\u2000";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\4\1\0"+
    "\1\5\2\0\1\6\2\0\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\12\17\1\0\1\20\1\21"+
    "\1\22\1\23\2\0\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\2\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\35\1\43\1\44\1\45\1\46\5\35"+
    "\6\0\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\2\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\35\1\43\1\44\1\45\1\46\5\35\1\47\1\0"+
    "\1\50\7\0\1\3\44\0\1\35\12\0\1\35\4\0"+
    "\1\35\5\0\27\35\1\0\37\35\1\0\70\35\2\34"+
    "\115\35\1\44\u0142\35\4\0\14\35\16\0\5\35\7\0"+
    "\1\35\1\0\1\35\201\0\5\35\1\0\2\35\2\0"+
    "\4\35\1\0\1\35\6\0\1\35\1\0\3\35\1\0"+
    "\1\35\1\0\24\35\1\0\123\35\1\0\213\35\10\0"+
    "\246\35\1\0\46\35\2\0\1\35\6\0\51\35\107\0"+
    "\33\35\4\0\4\35\55\0\53\35\25\0\12\17\4\0"+
    "\2\35\1\0\143\35\1\0\1\35\17\0\2\35\7\0"+
    "\2\35\12\17\3\35\2\0\1\35\20\0\1\35\1\0"+
    "\36\35\35\0\131\35\13\0\1\35\16\0\12\17\41\35"+
    "\11\0\2\35\4\0\1\35\5\0\26\35\4\0\1\35"+
    "\11\0\1\35\3\0\1\35\27\0\31\35\7\0\13\35"+
    "\65\0\25\35\1\0\10\35\106\0\66\35\3\0\1\35"+
    "\22\0\1\35\7\0\12\35\4\0\12\17\1\0\20\35"+
    "\4\0\10\35\2\0\2\35\2\0\26\35\1\0\7\35"+
    "\1\0\1\35\3\0\4\35\3\0\1\35\20\0\1\35"+
    "\15\0\2\35\1\0\3\35\4\0\12\17\2\35\12\0"+
    "\1\35\10\0\6\35\4\0\2\35\2\0\26\35\1\0"+
    "\7\35\1\0\2\35\1\0\2\35\1\0\2\35\37\0"+
    "\4\35\1\0\1\35\7\0\12\17\2\0\3\35\20\0"+
    "\11\35\1\0\3\35\1\0\26\35\1\0\7\35\1\0"+
    "\2\35\1\0\5\35\3\0\1\35\22\0\1\35\17\0"+
    "\2\35\4\0\12\17\11\0\1\35\13\0\10\35\2\0"+
    "\2\35\2\0\26\35\1\0\7\35\1\0\2\35\1\0"+
    "\5\35\3\0\1\35\36\0\2\35\1\0\3\35\4\0"+
    "\12\17\1\0\1\35\21\0\1\35\1\0\6\35\3\0"+
    "\3\35\1\0\4\35\3\0\2\35\1\0\1\35\1\0"+
    "\2\35\3\0\2\35\3\0\3\35\3\0\14\35\26\0"+
    "\1\35\25\0\12\17\25\0\10\35\1\0\3\35\1\0"+
    "\27\35\1\0\20\35\3\0\1\35\32\0\3\35\5\0"+
    "\2\35\4\0\12\17\20\0\1\35\4\0\10\35\1\0"+
    "\3\35\1\0\27\35\1\0\12\35\1\0\5\35\3\0"+
    "\1\35\40\0\1\35\1\0\2\35\4\0\12\17\1\0"+
    "\2\35\22\0\10\35\1\0\3\35\1\0\51\35\2\0"+
    "\1\35\20\0\1\35\5\0\3\35\10\0\3\35\4\0"+
    "\12\17\12\0\6\35\5\0\22\35\3\0\30\35\1\0"+
    "\11\35\1\0\1\35\2\0\7\35\37\0\12\17\21\0"+
    "\60\35\1\0\2\35\14\0\7\35\11\0\12\17\47\0"+
    "\2\35\1\0\1\35\1\0\5\35\1\0\30\35\1\0"+
    "\1\35\1\0\12\35\1\0\2\35\11\0\1\35\2\0"+
    "\5\35\1\0\1\35\11\0\12\17\2\0\4\35\40\0"+
    "\1\35\37\0\12\17\26\0\10\35\1\0\44\35\33\0"+
    "\5\35\163\0\53\35\24\0\1\35\12\17\6\0\6\35"+
    "\4\0\4\35\3\0\1\35\3\0\2\35\7\0\3\35"+
    "\4\0\15\35\14\0\1\35\1\0\12\17\6\0\46\35"+
    "\1\0\1\35\5\0\1\35\2\0\53\35\1\0\u014d\35"+
    "\1\0\4\35\2\0\7\35\1\0\1\35\1\0\4\35"+
    "\2\0\51\35\1\0\4\35\2\0\41\35\1\0\4\35"+
    "\2\0\7\35\1\0\1\35\1\0\4\35\2\0\17\35"+
    "\1\0\71\35\1\0\4\35\2\0\103\35\45\0\20\35"+
    "\20\0\126\35\2\0\6\35\3\0\u016c\35\2\0\21\35"+
    "\1\0\32\35\5\0\113\35\6\0\10\35\7\0\15\35"+
    "\1\0\4\35\16\0\22\35\16\0\22\35\16\0\15\35"+
    "\1\0\3\35\17\0\64\35\43\0\1\35\4\0\1\35"+
    "\3\0\12\17\46\0\12\17\6\0\131\35\7\0\5\35"+
    "\2\0\42\35\1\0\1\35\5\0\106\35\12\0\37\35"+
    "\47\0\12\17\36\35\2\0\5\35\13\0\54\35\4\0"+
    "\32\35\6\0\12\17\46\0\27\35\11\0\65\35\53\0"+
    "\12\17\6\0\12\17\15\0\1\35\135\0\57\35\21\0"+
    "\7\35\4\0\12\17\51\0\36\35\15\0\2\35\12\17"+
    "\54\35\32\0\44\35\34\0\12\17\3\0\3\35\12\17"+
    "\44\35\2\0\11\35\7\0\53\35\2\0\3\35\51\0"+
    "\4\35\1\0\6\35\1\0\2\35\3\0\1\35\5\0"+
    "\300\35\100\0\26\35\2\0\6\35\2\0\46\35\2\0"+
    "\6\35\2\0\10\35\1\0\1\35\1\0\1\35\1\0"+
    "\1\35\1\0\37\35\2\0\65\35\1\0\7\35\1\0"+
    "\1\35\3\0\3\35\1\0\7\35\3\0\4\35\2\0"+
    "\6\35\4\0\15\35\5\0\3\35\1\0\7\35\53\0"+
    "\2\3\107\0\1\35\15\0\1\35\20\0\15\35\145\0"+
    "\1\35\4\0\1\35\2\0\12\35\1\0\1\35\3\0"+
    "\5\35\6\0\1\35\1\0\1\35\1\0\1\35\1\0"+
    "\4\35\1\0\13\35\2\0\4\35\5\0\5\35\4\0"+
    "\1\35\64\0\2\35\u017b\0\57\35\1\0\57\35\1\0"+
    "\205\35\6\0\4\35\3\0\2\35\14\0\46\35\1\0"+
    "\1\35\5\0\1\35\2\0\70\35\7\0\1\35\20\0"+
    "\27\35\11\0\7\35\1\0\7\35\1\0\7\35\1\0"+
    "\7\35\1\0\7\35\1\0\7\35\1\0\7\35\1\0"+
    "\7\35\120\0\1\35\325\0\2\35\52\0\5\35\5\0"+
    "\2\35\4\0\126\35\6\0\3\35\1\0\132\35\1\0"+
    "\4\35\5\0\53\35\1\0\136\35\21\0\33\35\65\0"+
    "\306\35\112\0\360\35\20\0\215\35\103\0\56\35\2\0"+
    "\15\35\3\0\20\35\12\17\2\35\24\0\57\35\20\0"+
    "\37\35\2\0\106\35\61\0\11\35\2\0\147\35\2\0"+
    "\65\35\2\0\5\35\60\0\13\35\1\0\3\35\1\0"+
    "\4\35\1\0\27\35\35\0\64\35\16\0\62\35\34\0"+
    "\12\17\30\0\6\35\3\0\1\35\1\0\2\35\1\0"+
    "\12\17\34\35\12\0\27\35\31\0\35\35\7\0\57\35"+
    "\34\0\1\35\12\17\6\0\5\35\1\0\12\35\12\17"+
    "\5\35\1\0\51\35\27\0\3\35\1\0\10\35\4\0"+
    "\12\17\6\0\27\35\3\0\1\35\3\0\62\35\1\0"+
    "\1\35\3\0\2\35\2\0\5\35\2\0\1\35\1\0"+
    "\1\35\30\0\3\35\2\0\13\35\7\0\3\35\14\0"+
    "\6\35\2\0\6\35\2\0\6\35\11\0\7\35\1\0"+
    "\7\35\1\0\53\35\1\0\14\35\10\0\163\35\15\0"+
    "\12\17\6\0\244\35\14\0\27\35\4\0\61\35\4\0"+
    "\u0100\3\156\35\2\0\152\35\46\0\7\35\14\0\5\35"+
    "\5\0\1\35\1\0\12\35\1\0\15\35\1\0\5\35"+
    "\1\0\1\35\1\0\2\35\1\0\2\35\1\0\154\35"+
    "\41\0\153\35\22\0\100\35\2\0\66\35\50\0\14\35"+
    "\164\0\5\35\1\0\207\35\23\0\12\17\7\0\32\35"+
    "\6\0\32\35\13\0\131\35\3\0\6\35\2\0\6\35"+
    "\2\0\6\35\2\0\3\35\43\0\14\35\1\0\32\35"+
    "\1\0\23\35\1\0\2\35\1\0\17\35\2\0\16\35"+
    "\42\0\173\35\205\0\35\35\3\0\61\35\57\0\40\35"+
    "\15\0\24\35\1\0\10\35\6\0\46\35\12\0\36\35"+
    "\2\0\44\35\4\0\10\35\60\0\236\35\2\0\12\17"+
    "\6\0\44\35\4\0\44\35\4\0\50\35\10\0\64\35"+
    "\234\0\67\35\11\0\26\35\12\0\10\35\230\0\6\35"+
    "\2\0\1\35\1\0\54\35\1\0\2\35\3\0\1\35"+
    "\2\0\27\35\12\0\27\35\11\0\37\35\101\0\23\35"+
    "\1\0\2\35\12\0\26\35\12\0\32\35\106\0\70\35"+
    "\6\0\2\35\100\0\1\35\17\0\4\35\1\0\3\35"+
    "\1\0\35\35\52\0\35\35\3\0\35\35\43\0\10\35"+
    "\1\0\34\35\33\0\66\35\12\0\26\35\12\0\23\35"+
    "\15\0\22\35\156\0\111\35\67\0\63\35\15\0\63\35"+
    "\15\0\44\35\14\0\12\17\306\0\35\35\12\0\1\35"+
    "\10\0\26\35\232\0\27\35\14\0\65\35\56\0\12\17"+
    "\23\0\55\35\40\0\31\35\7\0\12\17\11\0\44\35"+
    "\17\0\12\17\4\0\1\35\13\0\43\35\3\0\1\35"+
    "\14\0\60\35\16\0\4\35\13\0\12\17\1\35\1\0"+
    "\1\35\43\0\22\35\1\0\31\35\124\0\7\35\1\0"+
    "\1\35\1\0\4\35\1\0\17\35\1\0\12\35\7\0"+
    "\57\35\21\0\12\17\13\0\10\35\2\0\2\35\2\0"+
    "\26\35\1\0\7\35\1\0\2\35\1\0\5\35\3\0"+
    "\1\35\22\0\1\35\14\0\5\35\236\0\65\35\22\0"+
    "\4\35\5\0\12\17\5\0\1\35\40\0\60\35\24\0"+
    "\2\35\1\0\1\35\10\0\12\17\246\0\57\35\51\0"+
    "\4\35\44\0\60\35\24\0\1\35\13\0\12\17\46\0"+
    "\53\35\15\0\1\35\7\0\12\17\66\0\33\35\25\0"+
    "\12\17\306\0\54\35\164\0\100\35\12\17\25\0\1\35"+
    "\240\0\10\35\2\0\47\35\20\0\1\35\1\0\1\35"+
    "\34\0\1\35\12\0\50\35\7\0\1\35\25\0\1\35"+
    "\13\0\56\35\23\0\1\35\42\0\71\35\7\0\11\35"+
    "\1\0\45\35\21\0\1\35\17\0\12\17\30\0\36\35"+
    "\160\0\7\35\1\0\2\35\1\0\46\35\25\0\1\35"+
    "\11\0\12\17\6\0\6\35\1\0\2\35\1\0\40\35"+
    "\16\0\1\35\7\0\12\17\u0136\0\23\35\15\0\232\35"+
    "\346\0\304\35\274\0\57\35\321\0\107\35\271\0\71\35"+
    "\7\0\37\35\1\0\12\17\146\0\36\35\22\0\60\35"+
    "\20\0\4\35\14\0\12\17\11\0\25\35\5\0\23\35"+
    "\260\0\100\35\200\0\113\35\5\0\1\35\102\0\15\35"+
    "\100\0\2\35\1\0\1\35\34\0\370\35\10\0\363\35"+
    "\15\0\37\35\61\0\3\35\21\0\4\35\10\0\u018c\35"+
    "\4\0\153\35\5\0\15\35\3\0\11\35\7\0\12\35"+
    "\146\0\125\35\1\0\107\35\1\0\2\35\2\0\1\35"+
    "\2\0\2\35\2\0\4\35\1\0\14\35\1\0\1\35"+
    "\1\0\7\35\1\0\101\35\1\0\4\35\2\0\10\35"+
    "\1\0\7\35\1\0\34\35\1\0\4\35\1\0\5\35"+
    "\1\0\1\35\3\0\7\35\1\0\u0154\35\2\0\31\35"+
    "\1\0\31\35\1\0\37\35\1\0\31\35\1\0\37\35"+
    "\1\0\31\35\1\0\37\35\1\0\31\35\1\0\37\35"+
    "\1\0\31\35\1\0\10\35\2\0\62\17\55\35\12\0"+
    "\7\35\2\0\12\17\4\0\1\35\u0171\0\54\35\4\0"+
    "\12\17\6\0\305\35\73\0\104\35\7\0\1\35\4\0"+
    "\12\17\246\0\4\35\1\0\33\35\1\0\2\35\1\0"+
    "\1\35\2\0\1\35\1\0\12\35\1\0\4\35\1\0"+
    "\1\35\1\0\1\35\6\0\1\35\4\0\1\35\1\0"+
    "\1\35\1\0\1\35\1\0\3\35\1\0\2\35\1\0"+
    "\1\35\2\0\1\35\1\0\1\35\1\0\1\35\1\0"+
    "\1\35\1\0\1\35\1\0\2\35\1\0\1\35\2\0"+
    "\4\35\1\0\7\35\1\0\4\35\1\0\4\35\1\0"+
    "\1\35\1\0\12\35\1\0\21\35\5\0\3\35\1\0"+
    "\5\35\1\0\21\35\104\0\327\35\51\0\65\35\13\0"+
    "\336\35\2\0\u0182\35\16\0\u0131\35\37\0\36\35\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[28160];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\2\1\11\1\1\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\15\20\1\21\1\22\1\0\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\7\20\1\37\3\20\1\40\3\20"+
    "\1\41\1\42\1\43\1\13\1\44\4\20\1\45\1\46"+
    "\2\20\1\47\1\50\3\20\1\32\1\20\1\51\7\20"+
    "\1\52\1\20\1\53\1\54\2\20\1\55\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
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
    "\0\0\0\51\0\122\0\122\0\173\0\51\0\51\0\51"+
    "\0\244\0\315\0\366\0\u011f\0\u0148\0\u0171\0\u019a\0\51"+
    "\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2"+
    "\0\u030b\0\u0334\0\u035d\0\u0386\0\u03af\0\u03d8\0\u0401\0\u042a"+
    "\0\51\0\51\0\u0453\0\51\0\51\0\122\0\51\0\51"+
    "\0\u047c\0\51\0\u04a5\0\51\0\51\0\51\0\51\0\u04ce"+
    "\0\u04f7\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\u0334\0\u05ed"+
    "\0\u0616\0\u063f\0\u0334\0\u0668\0\u0691\0\u06ba\0\u0453\0\51"+
    "\0\51\0\u06e3\0\u0334\0\u070c\0\u0735\0\u075e\0\u0787\0\u07b0"+
    "\0\u0334\0\u07d9\0\u0802\0\u0334\0\u0334\0\u082b\0\u0854\0\u087d"+
    "\0\51\0\u08a6\0\u0334\0\u08cf\0\u08f8\0\u0921\0\u094a\0\u0973"+
    "\0\u099c\0\u09c5\0\u0334\0\u09ee\0\u0334\0\u0334\0\u0a17\0\u0a40"+
    "\0\u0334\0\u0334";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\2\32\1\33\3\32\1\34\1\35\1\36\1\37"+
    "\1\40\2\32\1\41\1\42\52\0\2\3\1\0\1\3"+
    "\6\0\1\3\35\0\2\43\2\0\45\43\11\0\1\44"+
    "\51\0\1\45\37\0\2\3\1\0\1\46\6\0\1\3"+
    "\51\0\1\47\6\0\1\50\42\0\1\51\51\0\1\52"+
    "\47\0\1\53\1\0\1\17\53\0\1\54\1\55\47\0"+
    "\1\56\50\0\1\57\52\0\14\32\1\60\6\32\26\0"+
    "\15\32\1\61\5\32\26\0\7\32\1\62\13\32\26\0"+
    "\15\32\1\63\5\32\26\0\12\32\1\64\10\32\26\0"+
    "\15\32\1\65\4\32\1\66\26\0\23\32\26\0\5\32"+
    "\1\67\5\32\1\70\1\71\6\32\26\0\15\32\1\72"+
    "\5\32\26\0\17\32\1\73\3\32\26\0\17\32\1\74"+
    "\3\32\26\0\4\32\1\75\16\32\26\0\21\32\1\76"+
    "\1\32\2\0\2\43\2\0\1\43\1\77\43\43\15\0"+
    "\1\100\4\0\1\101\45\0\1\102\55\0\3\32\1\103"+
    "\17\32\26\0\15\32\1\104\5\32\26\0\1\105\22\32"+
    "\26\0\22\32\1\106\26\0\20\32\1\107\2\32\26\0"+
    "\17\32\1\110\3\32\26\0\14\32\1\111\6\32\26\0"+
    "\16\32\1\112\4\32\26\0\16\32\1\113\2\32\1\114"+
    "\1\32\26\0\21\32\1\115\1\32\26\0\10\32\1\116"+
    "\12\32\26\0\21\32\1\117\1\32\26\0\17\32\1\120"+
    "\3\32\17\0\1\121\1\0\1\102\55\0\12\32\1\114"+
    "\10\32\26\0\17\32\1\114\3\32\26\0\1\32\1\122"+
    "\21\32\26\0\4\32\1\123\16\32\26\0\10\32\1\124"+
    "\12\32\26\0\15\32\1\125\5\32\26\0\22\32\1\126"+
    "\26\0\14\32\1\127\6\32\26\0\22\32\1\130\26\0"+
    "\10\32\1\131\12\32\26\0\12\32\1\132\10\32\26\0"+
    "\5\32\1\133\15\32\26\0\17\32\1\134\3\32\26\0"+
    "\21\32\1\135\1\32\26\0\21\32\1\136\1\32\26\0"+
    "\17\32\1\137\3\32\26\0\14\32\1\140\6\32\26\0"+
    "\4\32\1\114\16\32\26\0\21\32\1\141\1\32\26\0"+
    "\14\32\1\142\6\32\26\0\6\32\1\114\14\32\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2665];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\3\11\7\1\1\11\20\1\2\11"+
    "\1\0\2\11\1\1\2\11\1\1\1\11\1\1\4\11"+
    "\20\1\2\11\17\1\1\11\21\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    String name;
    int line;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yyline = 1;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { {return new Symbol(syn.EOF, null);}
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Symbol(syn.ERROR, yyline, yycolumn, yytext());
            }
          // fall through
          case 47: break;
          case 2:
            { /* Ignore */
            }
          // fall through
          case 48: break;
          case 3:
            { System.out.print("");
            }
          // fall through
          case 49: break;
          case 4:
            { return new Symbol(syn.MOD, yyline, yycolumn, yytext());
            }
          // fall through
          case 50: break;
          case 5:
            { return new Symbol(syn.I_PAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 51: break;
          case 6:
            { return new Symbol(syn.D_PAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 52: break;
          case 7:
            { return new Symbol(syn.MUL, yyline, yycolumn, yytext());
            }
          // fall through
          case 53: break;
          case 8:
            { return new Symbol(syn.SUM, yyline, yycolumn, yytext());
            }
          // fall through
          case 54: break;
          case 9:
            { return new Symbol(syn.SUB, yyline, yycolumn, yytext());
            }
          // fall through
          case 55: break;
          case 10:
            { return new Symbol(syn.DIV, yyline, yycolumn, yytext());
            }
          // fall through
          case 56: break;
          case 11:
            { return new Symbol(syn.NUMERO, yyline, yycolumn, yytext());
            }
          // fall through
          case 57: break;
          case 12:
            { return new Symbol(syn.P_COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 58: break;
          case 13:
            { return new Symbol(syn.MENOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 59: break;
          case 14:
            { return new Symbol(syn.IGUAL , yyline, yycolumn, yytext());
            }
          // fall through
          case 60: break;
          case 15:
            { return new Symbol(syn.MAYOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 61: break;
          case 16:
            { return new Symbol(syn.IDENTIFICADOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 62: break;
          case 17:
            { return new Symbol(syn.I_LLAVE, yyline, yycolumn, yytext());
            }
          // fall through
          case 63: break;
          case 18:
            { return new Symbol(syn.D_LLAVE, yyline, yycolumn, yytext());
            }
          // fall through
          case 64: break;
          case 19:
            { return new Symbol(syn.POW, yyline, yycolumn, yytext());
            }
          // fall through
          case 65: break;
          case 20:
            { return new Symbol(syn.INC, yyline, yycolumn, yytext());
            }
          // fall through
          case 66: break;
          case 21:
            { return new Symbol(syn.COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 67: break;
          case 22:
            { return new Symbol(syn.DEC, yyline, yycolumn, yytext());
            }
          // fall through
          case 68: break;
          case 23:
            { return new Symbol(syn.RETORNO, yyline, yycolumn, yytext());
            }
          // fall through
          case 69: break;
          case 24:
            { return new Symbol(syn.EX_RANGO, yyline, yycolumn, yytext());
            }
          // fall through
          case 70: break;
          case 25:
            { System.out.println("//");
            }
          // fall through
          case 71: break;
          case 26:
            { return new Symbol(syn.DECIMAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 72: break;
          case 27:
            { return new Symbol(syn.MENOR_IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 73: break;
          case 28:
            { return new Symbol(syn.DIFERENTE, yyline, yycolumn, yytext());
            }
          // fall through
          case 74: break;
          case 29:
            { return new Symbol(syn.IDENTICO, yyline, yycolumn, yytext());
            }
          // fall through
          case 75: break;
          case 30:
            { return new Symbol(syn.MAYOR_IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 76: break;
          case 31:
            { return new Symbol(syn.IF, yyline, yycolumn, yytext());
            }
          // fall through
          case 77: break;
          case 32:
            { return new Symbol(syn.OR, yyline, yycolumn, yytext());
            }
          // fall through
          case 78: break;
          case 33:
            { return new Symbol(syn.TEXTO, yyline, yycolumn, yytext());
            }
          // fall through
          case 79: break;
          case 34:
            { return new Symbol(syn.CONCAT, yyline, yycolumn, yytext());
            }
          // fall through
          case 80: break;
          case 35:
            { return new Symbol(syn.IN_RANGO, yyline, yycolumn, yytext());
            }
          // fall through
          case 81: break;
          case 36:
            { return new Symbol(syn.AND, yyline, yycolumn, yytext());
            }
          // fall through
          case 82: break;
          case 37:
            { return new Symbol(syn.FOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 83: break;
          case 38:
            { return new Symbol(syn.FUN, yyline, yycolumn, yytext());
            }
          // fall through
          case 84: break;
          case 39:
            { return new Symbol(syn.TIPODEDATO, yyline, yycolumn, yytext());
            }
          // fall through
          case 85: break;
          case 40:
            { return new Symbol(syn.NOT, yyline, yycolumn, yytext());
            }
          // fall through
          case 86: break;
          case 41:
            { return new Symbol(syn.ELSE, yyline, yycolumn, yytext());
            }
          // fall through
          case 87: break;
          case 42:
            { return new Symbol(syn.FORIF, yyline, yycolumn, yytext());
            }
          // fall through
          case 88: break;
          case 43:
            { return new Symbol(syn.INPUT, yyline, yycolumn, yytext());
            }
          // fall through
          case 89: break;
          case 44:
            { return new Symbol(syn.PRINT, yyline, yycolumn, yytext());
            }
          // fall through
          case 90: break;
          case 45:
            { return new Symbol(syn.IMPORT, yyline, yycolumn, yytext());
            }
          // fall through
          case 91: break;
          case 46:
            { return new Symbol(syn.RETURN, yyline, yycolumn, yytext());
            }
          // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
