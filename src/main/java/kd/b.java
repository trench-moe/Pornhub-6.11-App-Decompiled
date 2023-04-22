package kd;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import jd.j;

/* loaded from: classes2.dex */
public final class b<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f12066a;

    public b(f<T> fVar) {
        this.f12066a = fVar;
    }

    @Override // com.squareup.moshi.f
    public T fromJson(JsonReader jsonReader) {
        return jsonReader.v() == JsonReader.Token.NULL ? (T) jsonReader.s() : this.f12066a.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.f
    public void toJson(j jVar, T t2) {
        if (t2 == null) {
            jVar.k();
        } else {
            this.f12066a.toJson(jVar, (j) t2);
        }
    }

    public String toString() {
        return this.f12066a + ".nullSafe()";
    }
}
