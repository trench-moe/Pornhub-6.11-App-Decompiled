package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    ByteString getByteString(int i10);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
