(window.webpackJsonp=window.webpackJsonp||[]).push([[2],{387:function(e,t,r){"use strict";r.r(t);var o={props:{loading:{type:Boolean,default:!1},title:{type:String,default:""},iconTitle:{type:String,default:""}},methods:{slotInUse:function(e){return!!this.$slots[e]}}},n=r(39),l=r(49),c=r.n(l),d=r(180),v=r(122),f=r(373),m=r(179),h=r(181),_=r(374),component=Object(n.a)(o,(function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[e.title?r("v-row",[r("v-col",[r("v-row",{attrs:{"no-gutters":""}},[r("h2",{attrs:{color:"primary"}},[e._v("\n          "+e._s(e.title)+"\n        ")])])],1),e._v(" "),r("v-col",[r("v-row",{attrs:{justify:"end","no-gutters":""}},[r("v-icon",{attrs:{"x-large":""}},[e._v("\n          "+e._s(e.iconTitle)+"\n        ")])],1)],1)],1):e._e(),e._v(" "),[e._t("header")],e._v(" "),r("v-card",{staticClass:"mx-auto",attrs:{raised:"",outlined:""}},[r("v-card-subtitle",{directives:[{name:"show",rawName:"v-show",value:e.slotInUse("filter"),expression:"slotInUse('filter')"}],staticClass:"py-0"},[e._t("filter")],2),e._v(" "),e.loading?r("v-progress-linear",{attrs:{indeterminate:e.loading}}):e._e(),e._v(" "),r("v-card-text",{directives:[{name:"show",rawName:"v-show",value:e.slotInUse("body"),expression:"slotInUse('body')"}],staticClass:"py-0"},[r("v-row",{directives:[{name:"show",rawName:"v-show",value:e.slotInUse("body"),expression:"slotInUse('body')"}]},[r("v-col",[r("v-card",{attrs:{outlined:""}},[e._t("body")],2)],1)],1)],1),e._v(" "),r("v-row",{directives:[{name:"show",rawName:"v-show",value:e.slotInUse("footer"),expression:"slotInUse('footer')"}]},[r("v-col",[e._t("footer")],2)],1)],1)],2)}),[],!1,null,null,null);t.default=component.exports;c()(component,{VCard:d.a,VCardSubtitle:v.b,VCardText:v.c,VCol:f.a,VIcon:m.a,VProgressLinear:h.a,VRow:_.a})},388:function(e,t,r){"use strict";r.r(t);r(7),r(10),r(8),r(21),r(12),r(13),r(11),r(9);var o=r(2);function n(object,e){var t=Object.keys(object);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(object);e&&(r=r.filter((function(e){return Object.getOwnPropertyDescriptor(object,e).enumerable}))),t.push.apply(t,r)}return t}var l={props:{pageInfo:{type:Object,default:function(){return{page:1,itemsPerPage:20}}},total:{type:Number,default:0}},data:function(){return{mounted:!1,expanded:[],options:{page:1,itemsPerPage:20}}},computed:{listeners:function(){return function(e){for(var i=1;i<arguments.length;i++){var source=null!=arguments[i]?arguments[i]:{};i%2?n(Object(source),!0).forEach((function(t){Object(o.a)(e,t,source[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(source)):n(Object(source)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(source,t))}))}return e}({},this.$listeners)}},watch:{options:{handler:"searchList",deep:!0}},mounted:function(){this.mounted=!0},methods:{searchList:function(){this.mounted&&(this.$emit("update:pageInfo",this.options),this.$emit("change",this.options))}}},c=r(39),d=r(49),v=r.n(d),f=r(446),component=Object(c.a)(l,(function(){var e=this,t=e.$createElement;return(e._self._c||t)("v-data-table",e._g(e._b({attrs:{"no-data-text":"Sin información",expanded:e.expanded,"footer-props":{itemsPerPageText:"Items por página","items-per-page-options":[20,50,100]}},on:{"update:expanded":function(t){e.expanded=t}},scopedSlots:e._u([e._l(Object.keys(e.$scopedSlots),(function(t){return{key:t,fn:function(r){return[e._t(t,null,null,r)]}}}))],null,!0)},"v-data-table",e.$attrs,!1),e.listeners))}),[],!1,null,null,null);t.default=component.exports;v()(component,{VDataTable:f.a})},389:function(e,t,r){"use strict";r.r(t);var o={props:{providerToDelete:{type:Object,required:!0}},data:function(){return{dialog:!1}},methods:{deleteProvider:function(){this.$emit("eliminarProveedor",this.providerToDelete),this.dialog=!1}}},n=r(39),l=r(49),c=r.n(l),d=r(363),v=r(180),f=r(122),m=r(448),h=r(444),component=Object(n.a)(o,(function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-dialog",{attrs:{persistent:"","max-width":"400"},scopedSlots:e._u([{key:"activator",fn:function(t){var o=t.on,n=t.attrs;return[r("TheIconWithTooltip",e._g(e._b({attrs:{"icon-name":"mdi-trash-can","icon-color":"orange",title:"Eliminar"}},"TheIconWithTooltip",n,!1),o))]}}]),model:{value:e.dialog,callback:function(t){e.dialog=t},expression:"dialog"}},[e._v(" "),r("v-card",[r("v-card-title",{staticClass:"headline"},[e._v("\n      Eliminando provedoor "+e._s(e.providerToDelete.name)+"\n    ")]),e._v(" "),r("v-card-text",[e._v("Desea eliminar al proveedor "+e._s(e.providerToDelete.name)+", de codigo "+e._s(e.providerToDelete.code))]),e._v(" "),r("v-card-actions",[r("v-spacer"),e._v(" "),r("v-btn",{attrs:{color:"orange",text:""},on:{click:function(t){e.dialog=!1}}},[e._v("\n        Cancelar\n      ")]),e._v(" "),r("v-btn",{attrs:{color:"primary",text:""},on:{click:e.deleteProvider}},[e._v("\n        Aceptar\n      ")])],1)],1)],1)}),[],!1,null,null,null);t.default=component.exports;c()(component,{TheIconWithTooltip:r(253).default}),c()(component,{VBtn:d.a,VCard:v.a,VCardActions:f.a,VCardText:f.c,VCardTitle:f.d,VDialog:m.a,VSpacer:h.a})},390:function(e,t,r){"use strict";r.r(t);var o={components:{ProviderInfoCard:r(391).default},props:{providerToInfo:{type:Object,required:!0}},data:function(){return{dialog:!1}}},n=r(39),l=r(49),c=r.n(l),d=r(448),component=Object(n.a)(o,(function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-dialog",{attrs:{"max-width":"480"},scopedSlots:e._u([{key:"activator",fn:function(t){var o=t.on,n=t.attrs;return[r("TheIconWithTooltip",e._g(e._b({attrs:{"icon-name":"mdi-magnify","icon-color":"primary",title:"Mas Información"}},"TheIconWithTooltip",n,!1),o))]}}]),model:{value:e.dialog,callback:function(t){e.dialog=t},expression:"dialog"}},[e._v(" "),r("ProviderInfoCard",{attrs:{"provider-to-info":e.providerToInfo},on:{closeDialog:function(t){e.dialog=!1}}})],1)}),[],!1,null,null,null);t.default=component.exports;c()(component,{TheIconWithTooltip:r(253).default,ProviderInfoCard:r(391).default}),c()(component,{VDialog:d.a})},391:function(e,t,r){"use strict";r.r(t);var o={props:{providerToInfo:{type:Object,required:!0}},methods:{cerrarDialogo:function(){this.$emit("closeDialog")}}},n=r(39),l=r(49),c=r.n(l),d=r(363),v=r(180),f=r(122),m=r(373),h=r(385),_=r(179),y=r(114),I=r(186),x=r(84),T=r(374),w=r(444),component=Object(n.a)(o,(function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-card",{staticClass:"mx-auto",attrs:{outlined:""}},[r("v-row",{attrs:{"no-gutters":"",justify:"center"}},[r("v-col",{attrs:{cols:"11"}},[r("v-card-title",{staticClass:"card-headline"},[e._v("\n        Información de proveedor\n      ")])],1),e._v(" "),r("v-spacer"),e._v(" "),r("v-col",{staticClass:"mt-4",attrs:{cols:"1"}},[r("v-btn",{attrs:{color:"orange",icon:"",small:""},on:{click:e.cerrarDialogo}},[r("v-icon",{attrs:{dark:""}},[e._v("\n          mdi-close\n        ")])],1)],1)],1),e._v(" "),r("v-divider"),e._v(" "),r("v-list-item",{staticClass:"px-6 my-2",attrs:{"three-line":""}},[r("v-list-item-content",[r("v-list-item-title",{staticClass:"subheadline mb-4"},[e._v("\n        "+e._s(e.providerToInfo.name)+"\n      ")]),e._v(" "),r("v-list-item-subtitle",[e._v(e._s(e.providerToInfo.products.map((function(e){return e.name})).join(", ")))])],1),e._v(" "),r("v-list-item-avatar",{attrs:{size:"70",color:"grey"}},[r("img",{attrs:{src:"https://cdn.vuetifyjs.com/images/john.jpg",alt:"John"}})])],1)],1)}),[],!1,null,null,null);t.default=component.exports;c()(component,{VBtn:d.a,VCard:v.a,VCardTitle:f.d,VCol:m.a,VDivider:h.a,VIcon:_.a,VListItem:y.a,VListItemAvatar:I.a,VListItemContent:x.a,VListItemSubtitle:x.b,VListItemTitle:x.c,VRow:T.a,VSpacer:w.a})},447:function(e,t,r){"use strict";r.r(t);r(10),r(44),r(83),r(33),r(59);var o=r(399),n=r(387),l=r(388),c=r(389),d=r(390),v={components:{TheLayoutWithHeader:n.default,TheFilterTable:l.default,DeleteConfirmationDialog:c.default,ProviderInfoDialog:d.default},data:function(){return{filter:{products:[]},products:["Lorem","Ipsum","asud","manzana"],headers:[{text:"Código",sortable:!0,value:"code"},{text:"Nombre",sortable:!0,value:"name"},{text:"Producto/s",value:"products",sortable:!0},{text:"Acciones",value:"actions",sortable:!1}],providers:[{code:"011323161351",name:"Lorem Ipsum",products:[{name:"Lorem"},{name:"Ipsum"}]},{code:"35616153",name:"Romann",products:[{name:"asud"}]},{code:"51912",name:"Pepito",products:[{name:"manzana"}]}]}},computed:{providers2:function(){var e,t=this,element={code:"011323161351",name:"Lorem Ipsum",products:[{name:"Lorem"},{name:"Ipsum"},{name:"asud"},{name:"oainsd"}]},r={code:"6511",name:"John Doe",products:[{name:"Lorem"}]},n={code:"545462",name:"Peter Doe",products:[{name:"Ipsum"}]},l=[];for(e=0;e<50;e++)l.push(Object(o.cloneDeep)(element)),l.push(Object(o.cloneDeep)(r)),l.push(Object(o.cloneDeep)(n));return l.filter((function(e){return(!t.filter.code||e.code.includes(t.filter.code))&&(!t.filter.name||e.name.toUpperCase().includes(t.filter.name.toUpperCase()))&&(0===t.filter.products.length||e.products.some((function(e){return t.filter.products.includes(e.name)})))}))},showableProviders:function(){var e=this;return this.providers.filter((function(t){return(!e.filter.code||t.code.includes(e.filter.code))&&(!e.filter.name||t.name.toUpperCase().includes(e.filter.name.toUpperCase()))&&(0===e.filter.products.length||t.products.some((function(t){return e.filter.products.includes(t.name)})))}))}},methods:{search:function(){this.toastNotification("Acá habría lógica ")},removeItemFromList:function(e){this.providers=this.providers.filter((function(t){return t!==e}))}}},f=r(39),m=r(49),h=r.n(m),_=r(445),y=r(363),I=r(373),x=r(374),T=r(392),component=Object(f.a)(v,(function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("TheLayoutWithHeader",{attrs:{title:"Mis proveedores","icon-title":"mdi-account-supervisor-circle"},scopedSlots:e._u([{key:"filter",fn:function(){return[r("v-row",[r("v-col",{attrs:{cols:"2"}},[r("v-text-field",{attrs:{label:"Filtrar por código",clearable:""},model:{value:e.filter.code,callback:function(t){e.$set(e.filter,"code",t)},expression:"filter.code"}})],1),e._v(" "),r("v-col",{attrs:{cols:"2"}},[r("v-text-field",{attrs:{label:"Filtrar por nombre",clearable:""},model:{value:e.filter.name,callback:function(t){e.$set(e.filter,"name",t)},expression:"filter.name"}})],1),e._v(" "),r("v-col",{attrs:{cols:"5"}},[r("v-autocomplete",{attrs:{items:e.products,label:"Filtrar por productos",clearable:"",multiple:""},model:{value:e.filter.products,callback:function(t){e.$set(e.filter,"products",t)},expression:"filter.products"}})],1),e._v(" "),r("v-col",{attrs:{cols:"2"}},[r("v-btn",{staticClass:"mt-3",attrs:{color:"primary"},on:{click:e.search}},[e._v("\n          Buscar\n        ")])],1)],1)]},proxy:!0},{key:"body",fn:function(){return[r("TheFilterTable",{attrs:{items:e.showableProviders,headers:e.headers},scopedSlots:e._u([{key:"item.products",fn:function(t){var r=t.item;return[e._v("\n        "+e._s(r.products.map((function(e){return e.name})).join(", "))+"\n      ")]}},{key:"item.actions",fn:function(t){var o=t.item;return[r("ProviderInfoDialog",{attrs:{"provider-to-info":o}}),e._v(" "),r("DeleteConfirmationDialog",{attrs:{"provider-to-delete":o},on:{eliminarProveedor:e.removeItemFromList}})]}}],null,!0)})]},proxy:!0}])})}),[],!1,null,null,null);t.default=component.exports;h()(component,{ProviderInfoDialog:r(390).default,DeleteConfirmationDialog:r(389).default,TheFilterTable:r(388).default,TheLayoutWithHeader:r(387).default}),h()(component,{VAutocomplete:_.a,VBtn:y.a,VCol:I.a,VRow:x.a,VTextField:T.a})}}]);