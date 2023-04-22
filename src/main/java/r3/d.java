package r3;

import com.app.pornhub.domain.model.video.VideoMetaData;
import io.realm.c0;
import io.realm.internal.l;
import io.realm.v;

/* loaded from: classes2.dex */
public class d extends v implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public String f14640a;

    /* renamed from: b  reason: collision with root package name */
    public String f14641b;

    /* renamed from: c  reason: collision with root package name */
    public String f14642c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public double f14643e;

    /* renamed from: f  reason: collision with root package name */
    public int f14644f;

    /* renamed from: g  reason: collision with root package name */
    public int f14645g;

    /* renamed from: h  reason: collision with root package name */
    public long f14646h;

    /* renamed from: i  reason: collision with root package name */
    public String f14647i;

    /* renamed from: j  reason: collision with root package name */
    public String f14648j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14649k;

    /* renamed from: l  reason: collision with root package name */
    public short f14650l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14651m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public int f14652o;

    /* renamed from: p  reason: collision with root package name */
    public long f14653p;

    /* renamed from: q  reason: collision with root package name */
    public String f14654q;

    /* renamed from: r  reason: collision with root package name */
    public String f14655r;

    public d() {
        ((l) this).j();
    }

    public d(VideoMetaData videoMetaData, String str) {
        if (this instanceof l) {
            ((l) this).j();
        }
        D(videoMetaData.getId());
        O(videoMetaData.getVkey());
        H(videoMetaData.getTitle());
        B(videoMetaData.getDuration());
        F(videoMetaData.getRating());
        N(videoMetaData.getViewCount());
        z(videoMetaData.getCommentsCount());
        y(videoMetaData.getApprovedOn());
        L(str);
        K(videoMetaData.getUrlThumbnail());
        C(videoMetaData.isHd());
        M(videoMetaData.getVideoContentType().getCode());
        P(videoMetaData.isVr());
        I(videoMetaData.getUserMetaData().getUsername());
        boolean isVerified = videoMetaData.isVerified();
        boolean isContentPartner = videoMetaData.isContentPartner();
        if (isVerified) {
            J("verified");
        } else if (isContentPartner) {
            J("contentPartner");
        } else {
            J("std");
        }
    }

    public void A(long j10) {
        this.f14653p = j10;
    }

    public void B(int i10) {
        this.d = i10;
    }

    public void C(boolean z10) {
        this.f14649k = z10;
    }

    public void D(String str) {
        this.f14640a = str;
    }

    public void E(int i10) {
        this.f14652o = i10;
    }

    public void F(double d) {
        this.f14643e = d;
    }

    public void G(String str) {
        this.n = str;
    }

    public void H(String str) {
        this.f14642c = str;
    }

    public void I(String str) {
        this.f14654q = str;
    }

    public void J(String str) {
        this.f14655r = str;
    }

    public void K(String str) {
        this.f14647i = str;
    }

    public void L(String str) {
        this.f14648j = str;
    }

    public void M(short s10) {
        this.f14650l = s10;
    }

    public void N(int i10) {
        this.f14644f = i10;
    }

    public void O(String str) {
        this.f14641b = str;
    }

    public void P(boolean z10) {
        this.f14651m = z10;
    }

    public long a() {
        return this.f14653p;
    }

    public String b() {
        return this.n;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f14652o;
    }

    public boolean e() {
        return this.f14649k;
    }

    public long f() {
        return this.f14646h;
    }

    public String g() {
        return this.f14654q;
    }

    public int h() {
        return this.f14644f;
    }

    public short i() {
        return this.f14650l;
    }

    public String k() {
        return this.f14655r;
    }

    public boolean l() {
        return this.f14651m;
    }

    public String m() {
        return this.f14642c;
    }

    public String n() {
        return this.f14647i;
    }

    public String p() {
        return this.f14641b;
    }

    public int q() {
        return this.f14645g;
    }

    public String r() {
        return this.f14640a;
    }

    public double s() {
        return this.f14643e;
    }

    public String t() {
        return this.f14648j;
    }

    public boolean x() {
        return b().equals("finished");
    }

    public void y(long j10) {
        this.f14646h = j10;
    }

    public void z(int i10) {
        this.f14645g = i10;
    }
}
