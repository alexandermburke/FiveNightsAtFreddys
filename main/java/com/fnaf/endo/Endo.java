/*   1:    */ package com.fnaf.endo;
/*   2:    */ 
/*   3:    */ import net.minecraft.client.model.ModelBase;
/*   4:    */ import net.minecraft.client.model.ModelRenderer;
/*   5:    */ import net.minecraft.entity.Entity;
/*   6:    */ 
/*   7:    */ public class Endo
/*   8:    */   extends ModelBase
/*   9:    */ {
/*  10:    */   ModelRenderer Shape1;
/*  11:    */   ModelRenderer Shape2;
/*  12:    */   ModelRenderer Shape3;
/*  13:    */   ModelRenderer Shape4;
/*  14:    */   ModelRenderer Shape7;
/*  15:    */   ModelRenderer Shape8;
/*  16:    */   ModelRenderer Shape9;
/*  17:    */   ModelRenderer Shape10;
/*  18:    */   ModelRenderer Shape14;
/*  19:    */   ModelRenderer Shape15;
/*  20:    */   ModelRenderer Shape18;
/*  21:    */   ModelRenderer Shape19;
/*  22:    */   ModelRenderer Shape30;
/*  23:    */   ModelRenderer Shape31;
/*  24:    */   ModelRenderer Shape32;
/*  25:    */   ModelRenderer Shape33;
/*  26:    */   ModelRenderer Shape35;
/*  27:    */   ModelRenderer Shape52;
/*  28:    */   ModelRenderer Shape53;
/*  29:    */   ModelRenderer Shape54;
/*  30:    */   ModelRenderer Shape55;
/*  31:    */   ModelRenderer Shape56;
/*  32:    */   ModelRenderer Shape57;
/*  33:    */   ModelRenderer Shape58;
/*  34:    */   ModelRenderer Shape59;
/*  35:    */   ModelRenderer Shape60;
/*  36:    */   ModelRenderer Shape61;
/*  37:    */   ModelRenderer Shape62;
/*  38:    */   ModelRenderer Shape63;
/*  39:    */   ModelRenderer Shape64;
/*  40:    */   ModelRenderer Shape65;
/*  41:    */   ModelRenderer Shape66;
/*  42:    */   ModelRenderer Shape67;
/*  43:    */   ModelRenderer Shape68;
/*  44:    */   ModelRenderer Shape69;
/*  45:    */   ModelRenderer Shape70;
/*  46:    */   
/*  47:    */   public Endo()
/*  48:    */   {
/*  49: 49 */     this.field_78090_t = 128;
/*  50: 50 */     this.field_78089_u = 64;
/*  51:    */     
/*  52: 52 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/*  53: 53 */     this.Shape1.func_78789_a(-1.5F, 0.0F, -6.0F, 3, 1, 6);
/*  54: 54 */     this.Shape1.func_78793_a(-2.0F, 23.0F, 4.0F);
/*  55: 55 */     this.Shape1.func_78787_b(128, 64);
/*  56: 56 */     this.Shape1.field_78809_i = true;
/*  57: 57 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*  58: 58 */     this.Shape2 = new ModelRenderer(this, 0, 0);
/*  59: 59 */     this.Shape2.func_78789_a(-1.5F, 0.0F, -6.0F, 3, 1, 6);
/*  60: 60 */     this.Shape2.func_78793_a(2.0F, 23.0F, 4.0F);
/*  61: 61 */     this.Shape2.func_78787_b(128, 64);
/*  62: 62 */     this.Shape2.field_78809_i = true;
/*  63: 63 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/*  64: 64 */     this.Shape3 = new ModelRenderer(this, 0, 18);
/*  65: 65 */     this.Shape3.func_78789_a(-0.5F, 0.0F, -0.7F, 1, 6, 1);
/*  66: 66 */     this.Shape3.func_78793_a(-2.0F, 17.0F, 2.0F);
/*  67: 67 */     this.Shape3.func_78787_b(128, 64);
/*  68: 68 */     this.Shape3.field_78809_i = true;
/*  69: 69 */     setRotation(this.Shape3, 0.122173F, 0.0F, 0.0F);
/*  70: 70 */     this.Shape4 = new ModelRenderer(this, 0, 18);
/*  71: 71 */     this.Shape4.func_78789_a(-0.5F, 0.0F, -0.7F, 1, 6, 1);
/*  72: 72 */     this.Shape4.func_78793_a(2.0F, 17.0F, 2.0F);
/*  73: 73 */     this.Shape4.func_78787_b(128, 64);
/*  74: 74 */     this.Shape4.field_78809_i = true;
/*  75: 75 */     setRotation(this.Shape4, 0.122173F, 0.0F, 0.0F);
/*  76: 76 */     this.Shape7 = new ModelRenderer(this, 0, 53);
/*  77: 77 */     this.Shape7.func_78789_a(-2.5F, 0.0F, -1.5F, 5, 2, 3);
/*  78: 78 */     this.Shape7.func_78793_a(0.0F, 9.466666F, 1.7F);
/*  79: 79 */     this.Shape7.func_78787_b(128, 64);
/*  80: 80 */     this.Shape7.field_78809_i = true;
/*  81: 81 */     setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
/*  82: 82 */     this.Shape8 = new ModelRenderer(this, 0, 34);
/*  83: 83 */     this.Shape8.func_78789_a(-0.9666666F, 0.0F, -2.0F, 2, 6, 2);
/*  84: 84 */     this.Shape8.func_78793_a(-2.0F, 11.46667F, 2.5F);
/*  85: 85 */     this.Shape8.func_78787_b(128, 64);
/*  86: 86 */     this.Shape8.field_78809_i = true;
/*  87: 87 */     setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
/*  88: 88 */     this.Shape9 = new ModelRenderer(this, 0, 34);
/*  89: 89 */     this.Shape9.func_78789_a(-1.033333F, 0.0F, -2.0F, 2, 6, 2);
/*  90: 90 */     this.Shape9.func_78793_a(2.0F, 11.46667F, 2.5F);
/*  91: 91 */     this.Shape9.func_78787_b(128, 64);
/*  92: 92 */     this.Shape9.field_78809_i = true;
/*  93: 93 */     setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
/*  94: 94 */     this.Shape10 = new ModelRenderer(this, 37, 50);
/*  95: 95 */     this.Shape10.func_78789_a(-1.0F, -1.0F, -1.6F, 2, 10, 2);
/*  96: 96 */     this.Shape10.func_78793_a(0.0F, 1.466667F, 2.5F);
/*  97: 97 */     this.Shape10.func_78787_b(128, 64);
/*  98: 98 */     this.Shape10.field_78809_i = true;
/*  99: 99 */     setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
/* 100:100 */     this.Shape14 = new ModelRenderer(this, 19, 26);
/* 101:101 */     this.Shape14.func_78789_a(-4.5F, 0.0F, -2.466667F, 9, 1, 3);
/* 102:102 */     this.Shape14.func_78793_a(0.0F, -0.4333333F, 2.733333F);
/* 103:103 */     this.Shape14.func_78787_b(128, 64);
/* 104:104 */     this.Shape14.field_78809_i = true;
/* 105:105 */     setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
/* 106:106 */     this.Shape15 = new ModelRenderer(this, 18, 19);
/* 107:107 */     this.Shape15.func_78789_a(-1.0F, -4.5F, -1.0F, 2, 5, 2);
/* 108:108 */     this.Shape15.func_78793_a(0.0F, -0.4333333F, 1.8F);
/* 109:109 */     this.Shape15.func_78787_b(128, 64);
/* 110:110 */     this.Shape15.field_78809_i = true;
/* 111:111 */     setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
/* 112:112 */     this.Shape18 = new ModelRenderer(this, 67, 37);
/* 113:113 */     this.Shape18.func_78789_a(-3.0F, -6.0F, -2.0F, 6, 4, 2);
/* 114:114 */     this.Shape18.func_78793_a(0.0F, -2.433333F, 1.733333F);
/* 115:115 */     this.Shape18.func_78787_b(128, 64);
/* 116:116 */     this.Shape18.field_78809_i = true;
/* 117:117 */     setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
/* 118:118 */     this.Shape19 = new ModelRenderer(this, 51, 56);
/* 119:119 */     this.Shape19.func_78789_a(-2.0F, -2.0F, -2.0F, 4, 3, 1);
/* 120:120 */     this.Shape19.func_78793_a(0.0F, -2.433333F, 1.7F);
/* 121:121 */     this.Shape19.func_78787_b(128, 64);
/* 122:122 */     this.Shape19.field_78809_i = true;
/* 123:123 */     setRotation(this.Shape19, 0.0F, 0.0F, 0.0F);
/* 124:124 */     this.Shape30 = new ModelRenderer(this, 47, 5);
/* 125:125 */     this.Shape30.func_78789_a(-1.0F, 0.5333334F, -1.0F, 1, 5, 1);
/* 126:126 */     this.Shape30.func_78793_a(-3.5F, 0.0F, 2.0F);
/* 127:127 */     this.Shape30.func_78787_b(128, 64);
/* 128:128 */     this.Shape30.field_78809_i = true;
/* 129:129 */     setRotation(this.Shape30, 0.0872665F, 0.0F, 0.3665191F);
/* 130:130 */     this.Shape31 = new ModelRenderer(this, 47, 5);
/* 131:131 */     this.Shape31.func_78789_a(0.0F, 0.5333334F, -1.0F, 1, 5, 1);
/* 132:132 */     this.Shape31.func_78793_a(3.5F, 0.0F, 2.0F);
/* 133:133 */     this.Shape31.func_78787_b(128, 64);
/* 134:134 */     this.Shape31.field_78809_i = true;
/* 135:135 */     setRotation(this.Shape31, 0.0872665F, 0.0F, -0.3665191F);
/* 136:136 */     this.Shape32 = new ModelRenderer(this, 33, 31);
/* 137:137 */     this.Shape32.func_78789_a(-1.0F, 0.5333334F, -0.5F, 1, 5, 1);
/* 138:138 */     this.Shape32.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 139:139 */     this.Shape32.func_78787_b(128, 64);
/* 140:140 */     this.Shape32.field_78809_i = true;
/* 141:141 */     setRotation(this.Shape32, -0.10472F, 0.0F, 0.0F);
/* 142:142 */     this.Shape33 = new ModelRenderer(this, 33, 31);
/* 143:143 */     this.Shape33.func_78789_a(-0.03333334F, 0.5333334F, -0.5333334F, 1, 5, 1);
/* 144:144 */     this.Shape33.func_78793_a(5.5F, 4.5F, 2.0F);
/* 145:145 */     this.Shape33.func_78787_b(128, 64);
/* 146:146 */     this.Shape33.field_78809_i = true;
/* 147:147 */     setRotation(this.Shape33, -0.10472F, 0.0F, 0.0F);
/* 148:148 */     this.Shape35 = new ModelRenderer(this, 51, 38);
/* 149:149 */     this.Shape35.func_78789_a(0.0F, 5.533333F, -1.633333F, 1, 1, 3);
/* 150:150 */     this.Shape35.func_78793_a(5.5F, 4.5F, 2.0F);
/* 151:151 */     this.Shape35.func_78787_b(128, 64);
/* 152:152 */     this.Shape35.field_78809_i = true;
/* 153:153 */     setRotation(this.Shape35, -0.10472F, 0.0F, 0.0F);
/* 154:154 */     this.Shape52 = new ModelRenderer(this, 49, 46);
/* 155:155 */     this.Shape52.func_78789_a(-2.466667F, -1.0F, -0.133333F, 2, 2, 2);
/* 156:156 */     this.Shape52.func_78793_a(0.0F, -6.5F, -1.266667F);
/* 157:157 */     this.Shape52.func_78787_b(128, 64);
/* 158:158 */     this.Shape52.field_78809_i = true;
/* 159:159 */     setRotation(this.Shape52, 0.0F, 0.0F, 0.0F);
/* 160:160 */     this.Shape53 = new ModelRenderer(this, 49, 46);
/* 161:161 */     this.Shape53.func_78789_a(0.5F, -1.0F, -0.133333F, 2, 2, 2);
/* 162:162 */     this.Shape53.func_78793_a(0.0F, -6.5F, -1.266667F);
/* 163:163 */     this.Shape53.func_78787_b(128, 64);
/* 164:164 */     this.Shape53.field_78809_i = true;
/* 165:165 */     setRotation(this.Shape53, 0.0F, 0.0F, 0.0F);
/* 166:166 */     this.Shape54 = new ModelRenderer(this, 67, 47);
/* 167:167 */     this.Shape54.func_78789_a(-1.7F, -0.11F, -0.2F, 1, 1, 1);
/* 168:168 */     this.Shape54.func_78793_a(0.0F, -6.4F, -1.266667F);
/* 169:169 */     this.Shape54.func_78787_b(128, 64);
/* 170:170 */     this.Shape54.field_78809_i = true;
/* 171:171 */     setRotation(this.Shape54, 0.0F, 0.0F, 0.0F);
/* 172:172 */     this.Shape55 = new ModelRenderer(this, 67, 47);
/* 173:173 */     this.Shape55.func_78789_a(0.7F, -0.11F, -0.2F, 1, 1, 1);
/* 174:174 */     this.Shape55.func_78793_a(0.0F, -6.4F, -1.266667F);
/* 175:175 */     this.Shape55.func_78787_b(128, 64);
/* 176:176 */     this.Shape55.field_78809_i = true;
/* 177:177 */     setRotation(this.Shape55, 0.0F, 0.0F, 0.0F);
/* 178:178 */     this.Shape56 = new ModelRenderer(this, 54, 31);
/* 179:179 */     this.Shape56.func_78789_a(0.0F, 6.533333F, -1.633333F, 1, 3, 1);
/* 180:180 */     this.Shape56.func_78793_a(5.5F, 4.5F, 2.0F);
/* 181:181 */     this.Shape56.func_78787_b(128, 64);
/* 182:182 */     this.Shape56.field_78809_i = true;
/* 183:183 */     setRotation(this.Shape56, -0.122173F, 0.0F, 0.0F);
/* 184:184 */     this.Shape57 = new ModelRenderer(this, 54, 31);
/* 185:185 */     this.Shape57.func_78789_a(0.0F, 6.533333F, 0.366667F, 1, 3, 1);
/* 186:186 */     this.Shape57.func_78793_a(5.5F, 4.5F, 2.0F);
/* 187:187 */     this.Shape57.func_78787_b(128, 64);
/* 188:188 */     this.Shape57.field_78809_i = true;
/* 189:189 */     setRotation(this.Shape57, -0.0872665F, 0.0F, 0.0F);
/* 190:190 */     this.Shape58 = new ModelRenderer(this, 54, 31);
/* 191:191 */     this.Shape58.func_78789_a(0.3F, 6.533333F, -0.6333333F, 1, 3, 1);
/* 192:192 */     this.Shape58.func_78793_a(5.5F, 4.5F, 2.0F);
/* 193:193 */     this.Shape58.func_78787_b(128, 64);
/* 194:194 */     this.Shape58.field_78809_i = true;
/* 195:195 */     setRotation(this.Shape58, -0.10472F, 0.0F, 0.0F);
/* 196:196 */     this.Shape59 = new ModelRenderer(this, 62, 31);
/* 197:197 */     this.Shape59.func_78789_a(0.0F, 0.5333334F, -2.633333F, 1, 2, 1);
/* 198:198 */     this.Shape59.func_78793_a(5.5F, 10.5F, 2.0F);
/* 199:199 */     this.Shape59.func_78787_b(128, 64);
/* 200:200 */     this.Shape59.field_78809_i = true;
/* 201:201 */     setRotation(this.Shape59, -0.20944F, 0.0F, 0.453786F);
/* 202:202 */     this.Shape60 = new ModelRenderer(this, 51, 38);
/* 203:203 */     this.Shape60.func_78789_a(-1.0F, 5.533333F, -1.633333F, 1, 1, 3);
/* 204:204 */     this.Shape60.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 205:205 */     this.Shape60.func_78787_b(128, 64);
/* 206:206 */     this.Shape60.field_78809_i = true;
/* 207:207 */     setRotation(this.Shape60, -0.10472F, 0.0F, 0.0F);
/* 208:208 */     this.Shape61 = new ModelRenderer(this, 54, 31);
/* 209:209 */     this.Shape61.func_78789_a(-1.0F, 6.533333F, 0.366667F, 1, 3, 1);
/* 210:210 */     this.Shape61.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 211:211 */     this.Shape61.func_78787_b(128, 64);
/* 212:212 */     this.Shape61.field_78809_i = true;
/* 213:213 */     setRotation(this.Shape61, -0.0872665F, 0.0F, 0.0F);
/* 214:214 */     this.Shape62 = new ModelRenderer(this, 54, 31);
/* 215:215 */     this.Shape62.func_78789_a(-1.0F, 6.533333F, -1.633333F, 1, 3, 1);
/* 216:216 */     this.Shape62.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 217:217 */     this.Shape62.func_78787_b(128, 64);
/* 218:218 */     this.Shape62.field_78809_i = true;
/* 219:219 */     setRotation(this.Shape62, -0.122173F, 0.0F, 0.0F);
/* 220:220 */     this.Shape63 = new ModelRenderer(this, 54, 31);
/* 221:221 */     this.Shape63.func_78789_a(-1.3F, 6.533333F, -0.6333333F, 1, 3, 1);
/* 222:222 */     this.Shape63.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 223:223 */     this.Shape63.func_78787_b(128, 64);
/* 224:224 */     this.Shape63.field_78809_i = true;
/* 225:225 */     setRotation(this.Shape63, -0.10472F, 0.0F, 0.0F);
/* 226:226 */     this.Shape64 = new ModelRenderer(this, 62, 31);
/* 227:227 */     this.Shape64.func_78789_a(-1.0F, 0.5333334F, -2.633333F, 1, 2, 1);
/* 228:228 */     this.Shape64.func_78793_a(-5.5F, 10.5F, 2.0F);
/* 229:229 */     this.Shape64.func_78787_b(128, 64);
/* 230:230 */     this.Shape64.field_78809_i = true;
/* 231:231 */     setRotation(this.Shape64, -0.20944F, 0.0F, -0.453786F);
/* 232:232 */     this.Shape65 = new ModelRenderer(this, 28, 50);
/* 233:233 */     this.Shape65.func_78789_a(-0.5333334F, -1.533333F, -1.6F, 1, 5, 1);
/* 234:234 */     this.Shape65.func_78793_a(-2.5F, 1.466667F, 3.166667F);
/* 235:235 */     this.Shape65.func_78787_b(128, 64);
/* 236:236 */     this.Shape65.field_78809_i = true;
/* 237:237 */     setRotation(this.Shape65, 0.0F, 0.0F, -0.645772F);
/* 238:238 */     this.Shape66 = new ModelRenderer(this, 28, 50);
/* 239:239 */     this.Shape66.func_78789_a(-0.5333334F, -1.533333F, -1.6F, 1, 5, 1);
/* 240:240 */     this.Shape66.func_78793_a(2.5F, 1.466667F, 3.166667F);
/* 241:241 */     this.Shape66.func_78787_b(128, 64);
/* 242:242 */     this.Shape66.field_78809_i = true;
/* 243:243 */     setRotation(this.Shape66, 0.0F, 0.0F, 0.645772F);
/* 244:244 */     this.Shape67 = new ModelRenderer(this, 71, 56);
/* 245:245 */     this.Shape67.func_78789_a(-1.5F, -2.2F, -4.0F, 3, 1, 2);
/* 246:246 */     this.Shape67.func_78793_a(0.03F, -2.433333F, 1.7F);
/* 247:247 */     this.Shape67.func_78787_b(128, 64);
/* 248:248 */     this.Shape67.field_78809_i = true;
/* 249:249 */     setRotation(this.Shape67, 0.0F, 0.0F, 0.0F);
/* 250:250 */     this.Shape68 = new ModelRenderer(this, 87, 56);
/* 251:251 */     this.Shape68.func_78789_a(-1.5F, -0.2F, -4.0F, 3, 1, 2);
/* 252:252 */     this.Shape68.func_78793_a(0.0F, -2.433333F, 1.7F);
/* 253:253 */     this.Shape68.func_78787_b(128, 64);
/* 254:254 */     this.Shape68.field_78809_i = true;
/* 255:255 */     setRotation(this.Shape68, 0.0F, 0.0F, 0.0F);
/* 256:256 */     this.Shape69 = new ModelRenderer(this, 109, 56);
/* 257:257 */     this.Shape69.func_78789_a(-1.5F, -1.866667F, -3.533333F, 3, 1, 0);
/* 258:258 */     this.Shape69.func_78793_a(0.03F, -2.433333F, 1.7F);
/* 259:259 */     this.Shape69.func_78787_b(128, 64);
/* 260:260 */     this.Shape69.field_78809_i = true;
/* 261:261 */     setRotation(this.Shape69, 0.0F, 0.0F, 0.0F);
/* 262:262 */     this.Shape70 = new ModelRenderer(this, 109, 56);
/* 263:263 */     this.Shape70.func_78789_a(-1.5F, -0.5333334F, -3.533333F, 3, 1, 0);
/* 264:264 */     this.Shape70.func_78793_a(0.0F, -2.433333F, 1.7F);
/* 265:265 */     this.Shape70.func_78787_b(128, 64);
/* 266:266 */     this.Shape70.field_78809_i = true;
/* 267:267 */     setRotation(this.Shape70, 0.0F, 0.0F, 0.0F);
/* 268:    */   }
/* 269:    */   
/* 270:    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/* 271:    */   {
/* 272:272 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 273:273 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/* 274:274 */     this.Shape1.func_78785_a(f5);
/* 275:275 */     this.Shape2.func_78785_a(f5);
/* 276:276 */     this.Shape3.func_78785_a(f5);
/* 277:277 */     this.Shape4.func_78785_a(f5);
/* 278:278 */     this.Shape7.func_78785_a(f5);
/* 279:279 */     this.Shape8.func_78785_a(f5);
/* 280:280 */     this.Shape9.func_78785_a(f5);
/* 281:281 */     this.Shape10.func_78785_a(f5);
/* 282:282 */     this.Shape14.func_78785_a(f5);
/* 283:283 */     this.Shape15.func_78785_a(f5);
/* 284:284 */     this.Shape18.func_78785_a(f5);
/* 285:285 */     this.Shape19.func_78785_a(f5);
/* 286:286 */     this.Shape30.func_78785_a(f5);
/* 287:287 */     this.Shape31.func_78785_a(f5);
/* 288:288 */     this.Shape32.func_78785_a(f5);
/* 289:289 */     this.Shape33.func_78785_a(f5);
/* 290:290 */     this.Shape35.func_78785_a(f5);
/* 291:291 */     this.Shape52.func_78785_a(f5);
/* 292:292 */     this.Shape53.func_78785_a(f5);
/* 293:293 */     this.Shape54.func_78785_a(f5);
/* 294:294 */     this.Shape55.func_78785_a(f5);
/* 295:295 */     this.Shape56.func_78785_a(f5);
/* 296:296 */     this.Shape57.func_78785_a(f5);
/* 297:297 */     this.Shape58.func_78785_a(f5);
/* 298:298 */     this.Shape59.func_78785_a(f5);
/* 299:299 */     this.Shape60.func_78785_a(f5);
/* 300:300 */     this.Shape61.func_78785_a(f5);
/* 301:301 */     this.Shape62.func_78785_a(f5);
/* 302:302 */     this.Shape63.func_78785_a(f5);
/* 303:303 */     this.Shape64.func_78785_a(f5);
/* 304:304 */     this.Shape65.func_78785_a(f5);
/* 305:305 */     this.Shape66.func_78785_a(f5);
/* 306:306 */     this.Shape67.func_78785_a(f5);
/* 307:307 */     this.Shape68.func_78785_a(f5);
/* 308:308 */     this.Shape69.func_78785_a(f5);
/* 309:309 */     this.Shape70.func_78785_a(f5);
/* 310:    */   }
/* 311:    */   
/* 312:    */   private void setRotation(ModelRenderer model, float x, float y, float z)
/* 313:    */   {
/* 314:314 */     model.field_78795_f = x;
/* 315:315 */     model.field_78796_g = y;
/* 316:316 */     model.field_78808_h = z;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
/* 320:    */   {
/* 321:321 */     super.func_78087_a(f, f1, f2, f3, f4, f5, null);
/* 322:    */   }
/* 323:    */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.endo.Endo
 * JD-Core Version:    0.7.1
 */