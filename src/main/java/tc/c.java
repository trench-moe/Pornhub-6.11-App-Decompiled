package tc;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c {
    public volatile int cachedSize = -1;

    public static final <T extends c> T mergeFrom(T t2, byte[] bArr) {
        return (T) mergeFrom(t2, bArr, 0, bArr.length);
    }

    public static final <T extends c> T mergeFrom(T t2, byte[] bArr, int i10, int i11) {
        try {
            a aVar = new a(bArr, i10, i11);
            t2.mergeFrom(aVar);
            if (aVar.f15412f == 0) {
                return t2;
            }
            throw new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
        } catch (InvalidProtocolBufferNanoException e10) {
            throw e10;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(c cVar, c cVar2) {
        int serializedSize;
        if (cVar == cVar2) {
            return true;
        }
        if (cVar == null || cVar2 == null || cVar.getClass() != cVar2.getClass() || cVar2.getSerializedSize() != (serializedSize = cVar.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(cVar, bArr, 0, serializedSize);
        toByteArray(cVar2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(c cVar, byte[] bArr, int i10, int i11) {
        try {
            CodedOutputByteBufferNano codedOutputByteBufferNano = new CodedOutputByteBufferNano(bArr, i10, i11);
            cVar.writeTo(codedOutputByteBufferNano);
            if (codedOutputByteBufferNano.f8104a.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public static final byte[] toByteArray(c cVar) {
        int serializedSize = cVar.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(cVar, bArr, 0, serializedSize);
        return bArr;
    }

    @Override // 
    public c clone() {
        return (c) super.clone();
    }

    public int computeSerializedSize() {
        return 0;
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public abstract c mergeFrom(a aVar);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a0.b.T(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            StringBuilder m10 = a1.a.m("Error printing proto: ");
            m10.append(e10.getMessage());
            return m10.toString();
        } catch (InvocationTargetException e11) {
            StringBuilder m11 = a1.a.m("Error printing proto: ");
            m11.append(e11.getMessage());
            return m11.toString();
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
    }
}
