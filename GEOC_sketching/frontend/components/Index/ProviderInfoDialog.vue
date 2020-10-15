<template>
  <v-dialog
    v-model="dialog"
    persistent
    max-width="400"
  >
    <template v-slot:activator="{ on, attrs }">
      <TheIconWithTooltip
        icon-name="mdi-magnify"
        icon-color="primary"
        title="Mas Información"
        v-bind="attrs"
        v-on="on"
      />
    </template>
    <ProviderInfoCard :provider-to-info="providerToInfo" @closeDialog="dialog = false" />
  </v-dialog>
</template>

<script>
import ProviderInfoCard from '~/components/Index/ProviderInfoCard'
export default {
  components: {
    ProviderInfoCard
  },
  props: {
    providerToInfo: {
      type: Object,
      required: true
    }
  },
  data () {
    return {
      dialog: false
    }
  }
}
</script>
