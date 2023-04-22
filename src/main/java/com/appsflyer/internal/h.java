package com.appsflyer.internal;

import android.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {
    public String AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    private byte[] valueOf;
    public String values;

    public h() {
    }

    public h(String str, byte[] bArr, String str2) {
        this.AFKeystoreWrapper = str;
        this.valueOf = bArr;
        this.values = str2;
    }

    public h(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i10 = 0;
        int i11 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFKeystoreWrapper = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.values = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.values);
                if (matcher.matches()) {
                    i10 = Integer.parseInt(matcher.group(1));
                    i11 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.valueOf = (i10 > 4 || i11 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            }
        }
        scanner.close();
    }

    public final byte[] valueOf() {
        return this.valueOf;
    }
}
