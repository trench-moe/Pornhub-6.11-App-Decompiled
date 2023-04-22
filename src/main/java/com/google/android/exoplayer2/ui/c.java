package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import java.util.Objects;
import k8.c0;
import w6.y;

/* loaded from: classes.dex */
public class c implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f6604a;

    public c(Resources resources) {
        Objects.requireNonNull(resources);
        this.f6604a = resources;
    }

    @Override // com.google.android.exoplayer2.ui.p
    public String a(y yVar) {
        String c10;
        String c11;
        int g10 = k8.p.g(yVar.B);
        if (g10 == -1) {
            String str = yVar.y;
            String str2 = null;
            if (str != null) {
                for (String str3 : c0.H(str)) {
                    c10 = k8.p.c(str3);
                    if (c10 != null && k8.p.j(c10)) {
                        break;
                    }
                }
            }
            c10 = null;
            if (c10 == null) {
                String str4 = yVar.y;
                if (str4 != null) {
                    String[] H = c0.H(str4);
                    int length = H.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        String c12 = k8.p.c(H[i10]);
                        if (c12 != null && k8.p.h(c12)) {
                            str2 = c12;
                            break;
                        }
                        i10++;
                    }
                }
                if (str2 == null) {
                    if (yVar.G == -1) {
                        if (yVar.H == -1) {
                            if (yVar.O == -1) {
                                g10 = yVar.P != -1 ? 1 : -1;
                            }
                        }
                        g10 = 2;
                    }
                }
            }
            g10 = 2;
        }
        String str5 = BuildConfig.FLAVOR;
        if (g10 == 2) {
            String[] strArr = new String[3];
            strArr[0] = d(yVar);
            int i11 = yVar.G;
            int i12 = yVar.H;
            if (i11 != -1 && i12 != -1) {
                str5 = this.f6604a.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i12));
            }
            strArr[1] = str5;
            strArr[2] = b(yVar);
            c11 = e(strArr);
        } else if (g10 == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = c(yVar);
            int i13 = yVar.O;
            if (i13 != -1 && i13 >= 1) {
                str5 = i13 != 1 ? i13 != 2 ? (i13 == 6 || i13 == 7) ? this.f6604a.getString(R.string.exo_track_surround_5_point_1) : i13 != 8 ? this.f6604a.getString(R.string.exo_track_surround) : this.f6604a.getString(R.string.exo_track_surround_7_point_1) : this.f6604a.getString(R.string.exo_track_stereo) : this.f6604a.getString(R.string.exo_track_mono);
            }
            strArr2[1] = str5;
            strArr2[2] = b(yVar);
            c11 = e(strArr2);
        } else {
            c11 = c(yVar);
        }
        return c11.length() == 0 ? this.f6604a.getString(R.string.exo_track_unknown) : c11;
    }

    public final String b(y yVar) {
        int i10 = yVar.f16868w;
        return i10 == -1 ? BuildConfig.FLAVOR : this.f6604a.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    public final String c(y yVar) {
        String str;
        String[] strArr = new String[2];
        String str2 = yVar.f16864j;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str3 = BuildConfig.FLAVOR;
        if (isEmpty || "und".equals(str2)) {
            str = str3;
        } else {
            str = (c0.f11939a >= 21 ? Locale.forLanguageTag(str2) : new Locale(str2)).getDisplayName();
        }
        strArr[0] = str;
        strArr[1] = d(yVar);
        String e10 = e(strArr);
        if (TextUtils.isEmpty(e10)) {
            if (!TextUtils.isEmpty(yVar.f16863f)) {
                str3 = yVar.f16863f;
            }
            e10 = str3;
        }
        return e10;
    }

    public final String d(y yVar) {
        String string = (yVar.n & 2) != 0 ? this.f6604a.getString(R.string.exo_track_role_alternate) : BuildConfig.FLAVOR;
        if ((yVar.n & 4) != 0) {
            string = e(string, this.f6604a.getString(R.string.exo_track_role_supplementary));
        }
        if ((yVar.n & 8) != 0) {
            string = e(string, this.f6604a.getString(R.string.exo_track_role_commentary));
        }
        return (yVar.n & 1088) != 0 ? e(string, this.f6604a.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String e(String... strArr) {
        String str = BuildConfig.FLAVOR;
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f6604a.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }
}
