package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f6605a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6606a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, String> f6607b;

        public b(String str, Map map, a aVar) {
            this.f6606a = str;
            this.f6607b = map;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final Comparator<c> f6608e = u7.d.f15622j;

        /* renamed from: f  reason: collision with root package name */
        public static final Comparator<c> f6609f = i8.d.f10592j;

        /* renamed from: a  reason: collision with root package name */
        public final int f6610a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6611b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6612c;
        public final String d;

        public c(int i10, int i11, String str, String str2, a aVar) {
            this.f6610a = i10;
            this.f6611b = i11;
            this.f6612c = str;
            this.d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0085d {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f6613a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<c> f6614b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f6605a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
