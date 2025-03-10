package dev.cortex.cortexbot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscordConfiguration {

    @Value("${discord.bot.token}")
    private String botToken;

    @Value("${discord.guild.id}")
    private Long guildId;

    @Value("${discord.owner.id}")
    private String ownerId;

    @Value("${discord.channel.suggestions}")
    private Long suggestionsChannelId;

    @Value("${discord.role.regular}")
    private Long regularRoleId;

    @Value("${discord.role.veteran}")
    private Long veteranRoleId;

    @Value("${discord.role.everyone}")
    private Long everyoneRoleId;

    @Value("${discord.role.overlord}")
    private Long overlordRole;

    @Value("${discord.role.staff}")
    private Long staffRole;

    @Value("${discord.emoji.green_tick}")
    private Long greenTickId;

    @Value("${discord.emoji.red_tick}")
    private Long redTickId;

    @Value("${discord.emoji.neutral_tick}")
    private Long neutralTickId;

    @Value("${discord.role.member}")
    private Long memberRoleId;

    @Value("${discord.loggingchannel}")
    private Long loggingChannel;

    public Long getLoggingChannel() {
        return loggingChannel;
    }

    public Long getMemberRoleId() {
        return memberRoleId;
    }

    public Long getGreenTickId() {
        return greenTickId;
    }

    public Long getRedTickId() {
        return redTickId;
    }

    public Long getNeutralTickId() {
        return neutralTickId;
    }

    public Long getEveryoneRoleId() {
        return everyoneRoleId;
    }

    public Long getOverlordRole() {
        return overlordRole;
    }

    public Long getStaffRole() {
        return staffRole;
    }

    public String getBotToken() {
        return botToken;
    }

    public Long getRegularRoleId() {
        return regularRoleId;
    }

    public Long getGuildId() {
        return guildId;
    }

    public Long getSuggestionsChannelId() {
        return suggestionsChannelId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Long getVeteranRoleId() {
        return veteranRoleId;
    }
}
