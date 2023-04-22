package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import a1.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes3.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;
    private final ClassId classId;
    private final T expectedVersion;
    private final String filePath;

    public IncompatibleVersionErrorData(T t2, T t8, String filePath, ClassId classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.actualVersion = t2;
        this.expectedVersion = t8;
        this.filePath = filePath;
        this.classId = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IncompatibleVersionErrorData) {
            IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
            return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath) && Intrinsics.areEqual(this.classId, incompatibleVersionErrorData.classId);
        }
        return false;
    }

    public int hashCode() {
        T t2 = this.actualVersion;
        int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
        T t8 = this.expectedVersion;
        return this.classId.hashCode() + a.b(this.filePath, (hashCode + (t8 != null ? t8.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("IncompatibleVersionErrorData(actualVersion=");
        m10.append(this.actualVersion);
        m10.append(", expectedVersion=");
        m10.append(this.expectedVersion);
        m10.append(", filePath=");
        m10.append(this.filePath);
        m10.append(", classId=");
        m10.append(this.classId);
        m10.append(')');
        return m10.toString();
    }
}
