<template>
  <v-dialog
    v-model="dialog"
    persistent
    max-width="290"
  >
    <template v-slot:activator="{ on, attrs }">
      <TheIconWithTooltip
        icon-name="mdi-trash-can"
        icon-color="orange"
        title="Eliminar"
        v-bind="attrs"
        v-on="on"
      />
    </template>
    <v-card>
      <v-card-title class="headline">
        Eliminando provedoor {{ providerToDelete.name }}
      </v-card-title>
      <v-card-text>Desea eliminar al proveedor {{ providerToDelete.name }}, de codigo {{ providerToDelete.code }}</v-card-text>
      <v-card-actions>
        <v-spacer />
        <v-btn
          color="orange"
          text
          @click="dialog = false"
        >
          Cancelar
        </v-btn>
        <v-btn
          color="primary"
          text
          @click="deleteProvider"
        >
          Aceptar
        </v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script>
export default {
  props: {
    providerToDelete: {
      type: Object,
      required: true
    }
  },
  data () {
    return {
      dialog: false
    }
  },
  methods: {
    deleteProvider () {
      this.$emit('eliminarProveedor', this.providerToDelete)
      this.dialog = false
    }
  }
}
</script>
