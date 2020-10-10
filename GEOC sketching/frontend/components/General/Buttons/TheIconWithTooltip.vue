<template>
  <TheButtonWithTooltip
    v-bind="$attrs"
    color="transparent"
    :icon-name="iconName"
    :icon-color="iconColor"
    :icon-x-large="iconXLarge"
    icon
    v-on="$listeners"
  />
</template>

<script>
import TheButtonWithTooltip from '~/components/General/Buttons/TheButtonWithTooltip'
export default {
  components: {
    TheButtonWithTooltip
  },
  props: {
    iconName: {
      type: String,
      required: true
    },
    iconColor: {
      type: String,
      required: true
    },
    iconXLarge: {
      type: Boolean,
      default: false
    }
  }
}
</script>
