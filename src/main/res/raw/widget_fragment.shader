precision highp float;

uniform int isLooking;
uniform vec4 color;
uniform sampler2D sampler;

varying vec2 tex;

vec4 overlayColor(vec4 over, vec4 under) {
    vec3 rgb = over.rgb * over.a + under.rgb * under.a * (1.0 - over.a);
    float a = under.a + (1.0 - under.a) * over.a;

    return vec4(rgb, a);
}

void main() {
    vec4 texColor = texture2D(sampler, tex);
    gl_FragColor = overlayColor(texColor, color);
}
