package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f13100a;

    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f13101a;

        public a(ClipData clipData, int i10) {
            this.f13101a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // n0.c.b
        public void a(Bundle bundle) {
            this.f13101a.setExtras(bundle);
        }

        @Override // n0.c.b
        public void b(Uri uri) {
            this.f13101a.setLinkUri(uri);
        }

        @Override // n0.c.b
        public c build() {
            return new c(new d(this.f13101a.build()));
        }

        @Override // n0.c.b
        public void c(int i10) {
            this.f13101a.setFlags(i10);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(Bundle bundle);

        void b(Uri uri);

        c build();

        void c(int i10);
    }

    /* renamed from: n0.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0218c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f13102a;

        /* renamed from: b  reason: collision with root package name */
        public int f13103b;

        /* renamed from: c  reason: collision with root package name */
        public int f13104c;
        public Uri d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f13105e;

        public C0218c(ClipData clipData, int i10) {
            this.f13102a = clipData;
            this.f13103b = i10;
        }

        @Override // n0.c.b
        public void a(Bundle bundle) {
            this.f13105e = bundle;
        }

        @Override // n0.c.b
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // n0.c.b
        public c build() {
            return new c(new f(this));
        }

        @Override // n0.c.b
        public void c(int i10) {
            this.f13104c = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f13106a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f13106a = contentInfo;
        }

        @Override // n0.c.e
        public ClipData a() {
            return this.f13106a.getClip();
        }

        @Override // n0.c.e
        public ContentInfo b() {
            return this.f13106a;
        }

        @Override // n0.c.e
        public int getSource() {
            return this.f13106a.getSource();
        }

        @Override // n0.c.e
        public int r() {
            return this.f13106a.getFlags();
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ContentInfoCompat{");
            m10.append(this.f13106a);
            m10.append("}");
            return m10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        ClipData a();

        ContentInfo b();

        int getSource();

        int r();
    }

    /* loaded from: classes2.dex */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f13107a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13108b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13109c;
        public final Uri d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f13110e;

        public f(C0218c c0218c) {
            ClipData clipData = c0218c.f13102a;
            Objects.requireNonNull(clipData);
            this.f13107a = clipData;
            int i10 = c0218c.f13103b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i10 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f13108b = i10;
            int i11 = c0218c.f13104c;
            if ((i11 & 1) == i11) {
                this.f13109c = i11;
                this.d = c0218c.d;
                this.f13110e = c0218c.f13105e;
                return;
            }
            StringBuilder m10 = a1.a.m("Requested flags 0x");
            m10.append(Integer.toHexString(i11));
            m10.append(", but only 0x");
            m10.append(Integer.toHexString(1));
            m10.append(" are allowed");
            throw new IllegalArgumentException(m10.toString());
        }

        @Override // n0.c.e
        public ClipData a() {
            return this.f13107a;
        }

        @Override // n0.c.e
        public ContentInfo b() {
            return null;
        }

        @Override // n0.c.e
        public int getSource() {
            return this.f13108b;
        }

        @Override // n0.c.e
        public int r() {
            return this.f13109c;
        }

        public String toString() {
            String sb2;
            StringBuilder m10 = a1.a.m("ContentInfoCompat{clip=");
            m10.append(this.f13107a.getDescription());
            m10.append(", source=");
            int i10 = this.f13108b;
            m10.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            m10.append(", flags=");
            int i11 = this.f13109c;
            m10.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            Uri uri = this.d;
            String str = BuildConfig.FLAVOR;
            if (uri == null) {
                sb2 = str;
            } else {
                StringBuilder m11 = a1.a.m(", hasLinkUri(");
                m11.append(this.d.toString().length());
                m11.append(")");
                sb2 = m11.toString();
            }
            m10.append(sb2);
            if (this.f13110e != null) {
                str = ", hasExtras";
            }
            return android.support.v4.media.b.m(m10, str, "}");
        }
    }

    public c(e eVar) {
        this.f13100a = eVar;
    }

    public String toString() {
        return this.f13100a.toString();
    }
}
