package cz.msebera.android.httpclient.util;

import a1.a;
import java.io.Serializable;
import java.nio.CharBuffer;
import kotlin.UByte;
import l9.e;
import vd.b;

/* loaded from: classes.dex */
public final class CharArrayBuffer implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int i10) {
        e.j(i10, "Buffer capacity");
        this.buffer = new char[i10];
    }

    public void a(char c10) {
        int i10 = this.len + 1;
        if (i10 > this.buffer.length) {
            g(i10);
        }
        this.buffer[this.len] = c10;
        this.len = i10;
    }

    public void b(CharArrayBuffer charArrayBuffer, int i10, int i11) {
        int i12;
        char[] cArr = charArrayBuffer.buffer;
        if (cArr == null) {
            return;
        }
        if (i10 < 0 || i10 > cArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > cArr.length) {
            StringBuilder o10 = a.o("off: ", i10, " len: ", i11, " b.length: ");
            o10.append(cArr.length);
            throw new IndexOutOfBoundsException(o10.toString());
        } else if (i11 == 0) {
        } else {
            int i13 = this.len + i11;
            if (i13 > this.buffer.length) {
                g(i13);
            }
            System.arraycopy(cArr, i10, this.buffer, this.len, i11);
            this.len = i13;
        }
    }

    public void c(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i10 = this.len + length;
        if (i10 > this.buffer.length) {
            g(i10);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i10;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.buffer[i10];
    }

    public void clear() {
        this.len = 0;
    }

    public void d(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null) {
            return;
        }
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > bArr.length) {
            StringBuilder o10 = a.o("off: ", i10, " len: ", i11, " b.length: ");
            o10.append(bArr.length);
            throw new IndexOutOfBoundsException(o10.toString());
        } else if (i11 == 0) {
        } else {
            int i13 = this.len;
            int i14 = i11 + i13;
            if (i14 > this.buffer.length) {
                g(i14);
            }
            while (i13 < i14) {
                this.buffer[i13] = (char) (bArr[i10] & UByte.MAX_VALUE);
                i10++;
                i13++;
            }
            this.len = i14;
        }
    }

    public char[] e() {
        return this.buffer;
    }

    public void f(int i10) {
        if (i10 <= 0) {
            return;
        }
        int length = this.buffer.length;
        int i11 = this.len;
        if (i10 > length - i11) {
            g(i11 + i10);
        }
    }

    public final void g(int i10) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i10)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
    }

    public int h(int i10) {
        return i(i10, 0, this.len);
    }

    public int i(int i10, int i11, int i12) {
        if (i11 < 0) {
            i11 = 0;
        }
        int i13 = this.len;
        if (i12 > i13) {
            i12 = i13;
        }
        if (i11 > i12) {
            return -1;
        }
        while (i11 < i12) {
            if (this.buffer[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean j() {
        return this.len == 0;
    }

    public String k(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 > this.len) {
                StringBuilder n = a.n("endIndex: ", i11, " > length: ");
                n.append(this.len);
                throw new IndexOutOfBoundsException(n.toString());
            } else if (i10 <= i11) {
                return new String(this.buffer, i10, i11 - i10);
            } else {
                throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
            }
        }
        throw new IndexOutOfBoundsException(a.j("Negative beginIndex: ", i10));
    }

    public String l(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 > this.len) {
                StringBuilder n = a.n("endIndex: ", i11, " > length: ");
                n.append(this.len);
                throw new IndexOutOfBoundsException(n.toString());
            } else if (i10 > i11) {
                throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
            } else {
                while (i10 < i11 && b.a(this.buffer[i10])) {
                    i10++;
                }
                while (i11 > i10 && b.a(this.buffer[i11 - 1])) {
                    i11--;
                }
                return new String(this.buffer, i10, i11 - i10);
            }
        }
        throw new IndexOutOfBoundsException(a.j("Negative beginIndex: ", i10));
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.len;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 > this.len) {
                StringBuilder n = a.n("endIndex: ", i11, " > length: ");
                n.append(this.len);
                throw new IndexOutOfBoundsException(n.toString());
            } else if (i10 <= i11) {
                return CharBuffer.wrap(this.buffer, i10, i11);
            } else {
                throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
            }
        }
        throw new IndexOutOfBoundsException(a.j("Negative beginIndex: ", i10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.len);
    }
}
